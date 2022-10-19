package ConsoleApplication

import ConsoleApplication.Trains.Train

class Printer {
    fun mainScreen() {
        println("## Main Screen ##")
        println("1. Search Trains")
        println("2. Book Train ")
        println("3. View Booked Tickets")
        println("4. Exit")
        println()
        print("Enter choice: ")
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

    fun printTicketDetails(ticket: Ticket) {
        println("<----- Ticket Details ----->")
        println("Train -> ${ticket.trainRef.trainNumber} - ${ticket.trainRef.trainName.lowercase()}")
        println("PNR number -> ${ticket.pnr}")
        println("Boarding Station -> ${ticket.boardingStation}")
        println("Destination Station -> ${ticket.destinationStation}")
        println("<----- Passenger's Details ----->")
        println("SNo.     Name     Age     ID")
        for (i in ticket.listOfPassengers.indices) {
            println("${i + 1} ${ticket.listOfPassengers[i]}")
        }
    }
}