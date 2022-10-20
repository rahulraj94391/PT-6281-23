package ConsoleApp.Trains

import ConsoleApp.Compartments.*
import ConsoleApp.Interfaces.I_Rajdhani
import ConsoleApp.Priority

class Rajdhani(
    trainName: String,
    trainNumber: Int,
    trainRoute: Array<Array<String>>,
    numberOfSeats: Int
) : Train(trainName, trainNumber, trainRoute, numberOfSeats), I_Rajdhani {
    init {
        super.coaches = alignCoaches()
    }

    private fun alignCoaches(): List<Coach> {
        //Todo: fill in the coach position
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