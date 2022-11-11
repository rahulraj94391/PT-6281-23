package ConsoleApp

import ConsoleApp.Storage.DB
import ConsoleApp.Storage.Routes
import ConsoleApp.Trains.Train

object Booking {
    private val validator = Validator()

    fun searchTrain() {
        val (src, dest) = srcAndDestIP()
        val trainsFromSrcToDest: MutableList<Train> = trainsFromSrcToDest(src, dest)
        Printer.printTrainNames(trainsFromSrcToDest)
        println()
    }

    fun bookTicket() {
        val (src, dest) = srcAndDestIP()
        val trainsFromSrcToDest: MutableList<Train> = trainsFromSrcToDest(src, dest)
        Printer.printTrainNames(trainsFromSrcToDest)
        if (trainsFromSrcToDest.size == 0) return
        var sNo: Int = validator.getIntegerInput(1..trainsFromSrcToDest.size).dec()
        val selectedTrain: Train = trainsFromSrcToDest[sNo]
        val noOfTravellers = validator.getValidNoOfTravellersInput()
        if (!selectedTrain.isSeatsAvailable(noOfTravellers)) {
            println("Seats are not available in ${selectedTrain.trainName} for $noOfTravellers travellers.")
            return
        }
        val user = giveUserRef()
        val listOfTravellers: MutableList<Person> = listOfTravellers(noOfTravellers)
        bookTicketInTrain(user, src, dest, selectedTrain, listOfTravellers)
        println("Ticket has been booked for ${listOfTravellers.size} traveller(s) in ${selectedTrain.trainName}.")
        println()
    }

    fun viewBookedTickets() {
        val user = giveUserRef()
        val size = user.tickets.size
        if (size == 0) {
            println("### No ticket(s) found ###")
            return
        }
        Printer.availableTickets(size, user)
        var choice: Int = validator.getIntegerInput(1..size)
        val ticket: Ticket = user.tickets[choice - 1]
        user.printTicketDetails(ticket)
        println()
    }

    private fun trainsFromSrcToDest(src: String, dest: String): MutableList<Train> {
        val trains: MutableList<Train> = mutableListOf()
        for (train in DB.listOfTrains) {
            var srcIdx: Int = -1
            var destIdx: Int = -1

            for (x in 0 until train.totalStops() - 1) {
                if (train.trainRoute[x][1].equals(src,true)) {
                    srcIdx = x
                    destIdx = x + 1
                    break
                }
            }
            while (srcIdx != -1 && destIdx != train.totalStops()) {
                if (train.trainRoute[destIdx][1].equals(dest,true) && srcIdx != -1) {
                    trains.add(train)
                    break
                }
                destIdx++
            }
        }
        return trains
    }

    private fun bookTicketInTrain(user: User, src: String, dest: String, train: Train, list: MutableList<Person>) {
        val ticket = Ticket(user.userId, src, dest, train)
        ticket.addTravellerOnTicket(list)
        user.addTicket(ticket)
        train.decrementSeat(list.size)
    }


    private fun srcAndDestIP(): Pair<String, String> {
        print("Enter Origin City: ")
        val sourceStn: String = readln().trim()
        print("Enter Destination City: ")
        val destinationStn: String = readln().trim()
        return Pair(sourceStn, destinationStn)
    }


    private fun listOfTravellers(noOfTravellers: Int): MutableList<Person> {
        val listOfTravellers: MutableList<Person> = mutableListOf()
        for (x in 1..noOfTravellers) {
            println("Enter details of traveller $x")
            val fullName = validator.getValidNameInput()
            val age = validator.getValidAgeInput()
            val person = Person(fullName, age, ID = "Aadhar Card xyz")
            listOfTravellers.add(person)
        }
        return listOfTravellers
    }

    private fun giveUserRef(): User {
        print("Enter user ID: ")
        var user = DB.mapOfUsers[readln()]
        while (user == null) {
            println("wrong username, try again ...")
            user = DB.mapOfUsers[readln()]
        }
        return user
    }
}
