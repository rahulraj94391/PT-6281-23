package ConsoleApp.Trains

import ConsoleApp.Compartments.Coach
import ConsoleApp.Priority

abstract class Train(
    var trainName: String,
    var trainNumber: Int,
    var trainRoute: Array<Array<String>>,
    var numberOfSeats: Int,
) {
    protected lateinit var coaches: List<Coach>


    fun decrementSeat(count: Int) { /*decrement on reservation*/
        this.numberOfSeats = this.numberOfSeats - count
        // more implementation based on the booking interval can be done here
    }

    fun incrementSeat(count: Int) { /*increment on cancellation*/
        this.numberOfSeats = this.numberOfSeats - count
        // more implementation based on the booking interval can be done here
    }

    fun isSeatsAvailable(count: Int): Boolean {
        if (this.numberOfSeats < count)
            return false
        return true

        // interval checking can be done here for booking
    }


    fun trainInfo(): String {
        return ""
    }

    abstract fun averageSpeed(): Int

    abstract fun maxSpeed(): Int

    fun getAvailableCompartments() {

    }

    abstract fun getEngineType(): String

    open fun priority(): Int {
        return Priority.LOW.level
    }

    abstract fun hasPantyCar(): Boolean
}