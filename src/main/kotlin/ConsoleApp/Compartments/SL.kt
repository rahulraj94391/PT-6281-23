package ConsoleApp.Compartments

import ConsoleApp.Interfaces.I_NonAC

class SL() : Coach(), I_NonAC {
    override val totalCapacity: Int = 80
    override var fan: Boolean = false
    override var windows: Boolean = true
}