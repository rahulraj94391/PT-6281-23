package ConsoleApp

import kotlin.system.exitProcess

fun main() {
    val validator = Validator()

    while (true) {
        Printer.mainScreen()
        val range: IntRange = 1..4
        when (validator.getIntegerInput(range)) {
            1 -> Booking.searchTrain()
            2 -> Booking.bookTicket()
            3 -> Booking.viewBookedTickets()
            4 -> exitProcess(0)
        }
    }
}
