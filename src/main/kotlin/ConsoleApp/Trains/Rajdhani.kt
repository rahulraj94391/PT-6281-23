package ConsoleApp.Trains

import ConsoleApp.Compartments.*
import ConsoleApp.Priority

class Rajdhani(
    trainName: String,
    trainNumber: Int,
    trainRoute: Array<Array<String>>,
    numberOfSeats: Int
) : Train(trainName, trainNumber, trainRoute, numberOfSeats) {
    override val maxSpeed: Int = 130
    override val avgSpeed: Int = 90

    val xyz:Int = 0
        get

    init {
        super.coaches = alignCoaches()
    }

    private fun alignCoaches(): List<Coach> {
        return listOf(AC1(), AC2(), AC3(), PantryCar())
    }

    override fun averageSpeed(): Int {
        return avgSpeed
    }

    override fun maxSpeed(): Int {
        return maxSpeed
    }

    override fun getEngineType(): String {
        return "Electric"
    }

    override fun priority(): Int {
        return Priority.MAX.level
    }

    override fun hasPantyCar(): Boolean {
        return true
    }
}