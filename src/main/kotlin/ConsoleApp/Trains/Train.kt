package ConsoleApp.Trains

import ConsoleApp.Compartments.*
import ConsoleApp.Priority

abstract class Train(
    trainName: String,
    trainNumber: Int,
    trainRoute: Array<Array<String>>,
    numberOfSeats: Int
) {
    var trainName: String
        get() = field
        protected set
    var trainNumber: Int
        get() = field
        protected set
    var trainRoute: Array<Array<String>>
        get() = field
        protected set
    var numberOfSeats: Int
        get() = field
        protected set
    protected abstract val maxSpeed: Int
    protected abstract val avgSpeed: Int
    protected lateinit var coaches: List<Coach>

    init {
        this.trainNumber = trainNumber
        this.trainName = trainName
        this.trainRoute = trainRoute
        this.numberOfSeats = numberOfSeats
    }


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

    fun totalStops(): Int {
        return this.trainRoute.size
    }

    fun trainInfo(): String {
        return "train Info Not defined yet"
    }

    abstract fun averageSpeed(): Int

    abstract fun maxSpeed(): Int

    fun listOfCoaches(): MutableSet<String> {
        val listOfCoaches = mutableSetOf<String>()
        for (coach in coaches) {
            val i = when (coach) {
                is _2S -> "_2S"
                is AC1 -> "AC1"
                is AC2 -> "AC2"
                is AC3 -> "AC3"
                is GN -> "GN"
                is MailCompartment -> "MAIL"
                is PantryCar -> "PANTRY"
                is SL -> "SL"
                is CC -> "CC"
                else -> {
                    "NotDefined"
                }
            }
            listOfCoaches.add(i)
        }
        return listOfCoaches
    }

    abstract fun getEngineType(): String

    open fun priority(): Int {
        return Priority.LOW.level
    }

    abstract fun hasPantyCar(): Boolean
}