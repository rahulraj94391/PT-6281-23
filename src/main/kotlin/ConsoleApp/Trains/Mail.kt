package ConsoleApp.Trains

import ConsoleApp.Compartments.*

class Mail(trainName: String, trainNumber: Int, trainRoute: Array<Array<String>>, numberOfSeats: Int) :
    Train(trainName, trainNumber, trainRoute, numberOfSeats) {

    init {
        super.coaches = alignCoaches()
    }

    private fun alignCoaches(): List<Coach> {
        /*Train number: 22891- 2s,3a,cc*/
        return listOf(_2S(), AC3(), CC(), PantryCar(), MailCompartment())
    }

    override val maxSpeed: Int = 105
    override val avgSpeed: Int = 45

    override fun averageSpeed(): Int {
        return avgSpeed
    }

    override fun maxSpeed(): Int {
        return maxSpeed
    }

    override fun getEngineType(): String {
        return "Electric"
    }

    override fun hasPantyCar(): Boolean {
        return true
    }
}

