package ConsoleApp.Compartments

import ConsoleApp.Interfaces.I_AC

class AC2() : PassengerCoach(), I_AC {
    override val totalCapacity: Int = 54
    override var currentCapability: Int = totalCapacity
    override var temperature: Int = 27
}