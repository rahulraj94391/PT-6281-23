package ConsoleApp

import ConsoleApp.Store.DB
import ConsoleApp.Trains.Train
import ConsoleApplication.User
import kotlin.system.exitProcess

fun main() {
    val printer = Printer()
    val booking = Booking()

    while (true) {
        printer.mainScreen()
        var choice = readln().toInt()
        while (choice !in 1..4) {
            print("Enter correct choice: ")
            choice = readln().toInt()
        }
        when (choice) {
            1 -> searchTrain(printer, booking)
            2 -> bookTicket(printer, booking)
            3 -> viewBookedTickets(printer)
            4 -> exitProcess(0)
        }
    }
}


fun searchTrain(printer: Printer, booking: Booking) {
    val (src, dest) = srcAndDestIP()
    val trainsFromSrcToDest: MutableList<Train> = booking.trainsFromSrcToDest(src, dest)
    printer.printTrainNames(trainsFromSrcToDest)
    println()
}

fun srcAndDestIP(): Pair<String, String> {
    print("Enter Origin City: ")
    val sourceStn: String = readln().uppercase().trim()
    print("Enter Destination City: ")
    val destinationStn: String = readln().uppercase().trim()
    return Pair(sourceStn, destinationStn)
}

fun bookTicket(printer: Printer, booking: Booking) {
    val (src, dest) = srcAndDestIP()
    val trainsFromSrcToDest: MutableList<Train> = booking.trainsFromSrcToDest(src, dest)
    printer.printTrainNames(trainsFromSrcToDest)
    if (trainsFromSrcToDest.size == 0) return
    print("Choose train: ")
    var sNo: Int = readln().toInt() - 1
    while (sNo !in 0 until trainsFromSrcToDest.size) {
        print("Enter correct train S.no: ")
        sNo = readln().toInt()
    }
    val selectedTrain: Train = trainsFromSrcToDest[sNo]
    print("Enter no of travellers: ")
    val noOfTravellers = readln().toInt()
    if (noOfTravellers < 1) return
    if (!selectedTrain.isSeatsAvailable(noOfTravellers)) {
        println("Seats not available in ${selectedTrain.trainName} for $noOfTravellers travellers.")
        return
    }
    val user = giveUserRef()
    val listOfTravellers: MutableList<Person> = listOfTravellers(noOfTravellers)
    booking.bookTicketInTrain(user, src, dest, selectedTrain, listOfTravellers)
    println("Ticket has been booked for ${listOfTravellers.size} traveller(s) in ${selectedTrain.trainName}.")
    println()
}

fun listOfTravellers(noOfTravellers: Int): MutableList<Person> {
    val listOfTravellers: MutableList<Person> = mutableListOf()
    for (x in 1..noOfTravellers) {
        println("Enter name of traveller $x")
        val name = readln()
        println("Enter age of traveller $x")
        val age = readln().toInt()
        println("Enter ID number of traveller $x")
        val id = readln()
        val person = Person(name, age, id)
        listOfTravellers.add(person)
    }
    return listOfTravellers
}


fun giveUserRef(): User {
    print("Enter user ID: ")
    var user = DB.mapOfUsers[readln()]
    while (user == null) {
        println("wrong username, try again ...")
        user = DB.mapOfUsers[readln()]
    }
    return user
}

fun viewBookedTickets(printer: Printer) {
    val user = giveUserRef()
    val size = user.tickets.size
    if (size == 0) {
        println("No active tickets found !!!")
        return
    }
    println("Select the ticket:")
    println("S.No.      From        To")
    for (x in 0 until size) {
        println("${x + 1}.        ${user.tickets[x].boardingStation}        ${user.tickets[x].destinationStation}")
    }
    var choice: Int = readln().toInt()
    while (choice !in 1..size) {
        choice = readln().toInt()
    }
    val ticket = user.tickets[choice - 1]
    printer.printTicketDetails(ticket)
    println()
}







