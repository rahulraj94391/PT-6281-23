package ConsoleApp.Trains

import ConsoleApp.Compartments.Coach
import ConsoleApp.Interfaces.I_Mail
import ConsoleApp.Interfaces.I_Superfast
import ConsoleApp.Priority

class SFMail(
    trainName: String,
    trainNumber: Int,
    trainRoute: Array<Array<String>>,
    numberOfSeats: Int,
    coaches: List<Coach>
) : Train(trainName, trainNumber, trainRoute, numberOfSeats), I_Superfast, I_Mail {

    override val maxSpeed: Int
        get() = super<I_Superfast>.maxSpeed
    override val avgSpeed: Int
        get() = super<I_Superfast>.avgSpeed

    override fun averageSpeed(): Int {
        return avgSpeed
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
