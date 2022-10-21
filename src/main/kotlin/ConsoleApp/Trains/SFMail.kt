package ConsoleApp.Trains

import ConsoleApp.Compartments.*
import ConsoleApp.Interfaces.*
import ConsoleApp.Priority

class SFMail(
    trainName: String,
    trainNumber: Int,
    trainRoute: Array<Array<String>>,
    numberOfSeats: Int
) : Train(trainName, trainNumber, trainRoute, numberOfSeats), I_Superfast, I_Mail {

    init {
        super.coaches = alignCoaches()
    }

    override val maxSpeed: Int
        get() = super<I_Superfast>.maxSpeed

    override val avgSpeed: Int
        get() = super<I_Superfast>.avgSpeed

    override fun averageSpeed(): Int {
        return avgSpeed
    }

    private fun alignCoaches(): List<Coach> {
        return listOf(AC1(), AC2(), AC3(), PantryCar(), MailCompartment())
    }

    override fun maxSpeed(): Int {
        return maxSpeed
    }

    override fun getEngineType(): String {
        return "Electric Engine"
    }

    override fun priority(): Int {
        return Priority.MEDIUM.level
    }

    override fun hasPantyCar(): Boolean {
        return true
    }
}
