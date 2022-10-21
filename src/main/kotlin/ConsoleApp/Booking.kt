package ConsoleApp

import ConsoleApp.Storage.DB
import ConsoleApp.Trains.Train
import ConsoleApplication.User

class Booking {
    fun trainsFromSrcToDest(src: String, dest: String): MutableList<Train> {
        val trains: MutableList<Train> = mutableListOf()
        for (train in DB.listOfTrains) {
            var srcIdx: Int = -1
            var destIdx: Int = -1

            srcFound@ for (x in 0 until train.trainRoute.size - 1) {
                if (train.trainRoute[x][1] == src) {
                    srcIdx = x
                    destIdx = x + 1
                    break@srcFound
                }
            }
            destFound@ while (srcIdx != -1 && destIdx != train.trainRoute.size) {
                if (train.trainRoute[destIdx][1] == dest && srcIdx != -1) {
                    trains.add(train)
                    break@destFound
                }
                destIdx++
            }
        }
        return trains
    }

    fun bookTicketInTrain(user: User, src: String, dest: String, train: Train, list: MutableList<Person>) {
        val ticket = Ticket(user.userId, src, dest, train)
        ticket.addTravellerOnTicket(list)
        user.addTicket(ticket)
        train.decrementSeat(list.size)
    }

    fun printTrainNames(list: MutableList<Train>) {
        if (list.size == 0) {
            println("No Trains Found")
            return
        }
        println("Available Train(s) --->")
        for (i in list.indices) {
            println("${i + 1}. ${list[i].trainNumber} - ${list[i].trainName}")
        }
    }

    fun mainScreen() {
        println("## Main Screen ##")
        println("1. Search Trains")
        println("2. Book Train ")
        println("3. View Booked Tickets")
        println("4. Exit")
        println()
        print("Enter choice: ")
    }
}




















