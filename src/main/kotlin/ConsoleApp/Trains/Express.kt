package ConsoleApp.Trains

import ConsoleApp.Compartments.*
import ConsoleApp.Priority

class Express(trainName: String, trainNumber: Int, trainRoute: Array<Array<String>>, numberOfSeats: Int) :
    Train(trainName, trainNumber, trainRoute, numberOfSeats) {

    override val maxSpeed: Int = 105
    override val avgSpeed: Int = 45

    init {
        super.coaches = alignCoaches()
    }

    private fun alignCoaches(): List<Coach> {
        /*Train number: 22891- 2s,3a,cc*/
        /*Completes journey same day*/
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