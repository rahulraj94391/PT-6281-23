package ConsoleApp.Compartments

import ConsoleApp.Interfaces.I_AC

class AC1() : PassengerCoach(), I_AC {
    override val totalCapacity: Int = 24
    override var currentCapability: Int = totalCapacity
    override var temperature: Int = 27
}