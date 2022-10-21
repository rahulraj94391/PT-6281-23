package ConsoleApp.Compartments

import ConsoleApp.Interfaces.I_AC

class CC : PassengerCoach(), I_AC {
    override val totalCapacity: Int = 78
    override var currentCapability: Int = totalCapacity
    override var temperature: Int = 27

}

