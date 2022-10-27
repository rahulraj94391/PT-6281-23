package ConsoleApp

import kotlin.system.exitProcess

fun main() {
    val validator = Validator()

    while (true) {
        Printer.mainScreen()
        val range: IntRange = 1..4
        val choice = validator.getIntegerInput(range)
        when (choice) {
            1 -> Booking.searchTrain()
            2 -> Booking.bookTicket()
            3 -> Booking.viewBookedTickets()
            4 -> exitProcess(0)
        }
    }
}
