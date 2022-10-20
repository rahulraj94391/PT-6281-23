package ConsoleApp.Trains

import ConsoleApp.Compartments.*
import ConsoleApp.Interfaces.I_Express
import ConsoleApp.Priority

class Express(trainName: String, trainNumber: Int, trainRoute: Array<Array<String>>, numberOfSeats: Int) :
    Train(trainName, trainNumber, trainRoute, numberOfSeats), I_Express {

    init {
        super.coaches = alignCoaches()
    }

    private fun alignCoaches(): List<Coach> {
        /*Train number: 22891- 2s,3a,cc*/
        return listOf(_2S(), AC3(), CC())
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
        return Priority.MEDIUM.level
    }

    override fun hasPantyCar(): Boolean {
        return false
    }
}