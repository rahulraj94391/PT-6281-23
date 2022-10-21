package ConsoleApp.Compartments

import ConsoleApp.Interfaces.I_NonAC

class _2S() : PassengerCoach(), I_NonAC {
    override val totalCapacity: Int = 100
    override var currentCapability: Int = totalCapacity
    override var fan: Boolean = false
    override var windows: Boolean = true


}