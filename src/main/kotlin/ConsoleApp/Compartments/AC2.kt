package ConsoleApp.Compartments

import ConsoleApp.Interfaces.I_AC

class AC2() : Coach(), I_AC {
    override val totalCapacity: Int = 54
    override var temperature: Int = 27
}