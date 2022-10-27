package ConsoleApp

import kotlin.system.exitProcess

fun main() {
    val validator = Validator()

    while (true) {
        Printer.mainScreen()
        var choice = validator.getIntegerInput(1..4)
        when (choice) {
            1 -> Booking.searchTrain()
            2 -> Booking.bookTicket()
            3 -> Booking.viewBookedTickets()
            4 -> exitProcess(0)
        }
    }
}