package ConsoleApp

import java.lang.reflect.Field
import kotlin.system.exitProcess

fun main() {
    val validator = Validator()

    while (true) {
        Printer.mainScreen()
        when (validator.getIntegerInput(1..4)) {
            1 -> Booking.searchTrain()
            2 -> Booking.bookTicket()
            3 -> Booking.viewBookedTickets()
            4 -> exitProcess(0)
        }
    }
}
