package ConsoleApp.Compartments

import ConsoleApp.Interfaces.I_AC

class AC3() : Coach(), I_AC {
    override val totalCapacity: Int = 72
    override var temperature: Int = 27
}