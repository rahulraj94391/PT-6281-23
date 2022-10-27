package ConsoleApp

import ConsoleApp.Trains.Train

object Printer {
    fun mainScreen() {
        println("## Main Screen ##")
        println("1. Search Trains")
        println("2. Book Train ")
        println("3. View Booked Tickets")
        println("4. Exit")
        println()
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

    fun availableTickets(size: Int, user: User) {
        println("Select the ticket:")
        println("S.No.      From        To")
        for (x in 0 until size) {
            println("${x + 1}.        ${user.tickets[x].boardingStation}        ${user.tickets[x].destinationStation}")
        }
    }
}