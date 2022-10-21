package ConsoleApp

import ConsoleApp.Storage.DB
import ConsoleApp.Storage.Routes
import ConsoleApp.Trains.Rajdhani
import ConsoleApp.Trains.Train
import ConsoleApplication.User
import kotlin.system.exitProcess

fun amain() {
    val booking = Booking()

    while (true) {
        booking.mainScreen()
        var choice = readln().toInt()
        while (choice !in 1..4) {
            print("Enter correct choice: ")
            choice = readln().toInt()
        }
        when (choice) {
            1 -> searchTrain(booking)
            2 -> bookTicket(booking)
            3 -> viewBookedTickets()
            4 -> exitProcess(0)
        }
    }
}

fun main() {
    var rajdhani: Rajdhani = Rajdhani("NMZ Rajdhani", 123456, Routes.route12433, 20)
    rajdhani.coachesInTrain().forEach(::println)
}

fun searchTrain(booking: Booking) {
    val (src, dest) = srcAndDestIP()
    val trainsFromSrcToDest: MutableList<Train> = booking.trainsFromSrcToDest(src, dest)
    booking.printTrainNames(trainsFromSrcToDest)
    println()
}

fun srcAndDestIP(): Pair<String, String> {
    print("Enter Origin City: ")
    val sourceStn: String = readln().uppercase().trim()
    print("Enter Destination City: ")
    val destinationStn: String = readln().uppercase().trim()
    return Pair(sourceStn, destinationStn)
}

fun bookTicket(booking: Booking) {
    val (src, dest) = srcAndDestIP()
    val trainsFromSrcToDest: MutableList<Train> = booking.trainsFromSrcToDest(src, dest)
    booking.printTrainNames(trainsFromSrcToDest)
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

fun viewBookedTickets() {
    val user = giveUserRef()
    val size = user.tickets.size
    if (size == 0) {
        println("No ticket(s) found !!!")
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
    user.printTicketDetails(ticket)
    println()
}