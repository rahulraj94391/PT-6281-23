package ConsoleApp.Compartments

import ConsoleApp.Interfaces.I_AC

class AC3() : PassengerCoach(), I_AC {
    override val totalCapacity: Int = 72
    override var currentCapability: Int = totalCapacity
    override var temperature: Int = 27
}