package ConsoleApp.Compartments

import ConsoleApp.Interfaces.I_AC

class AC1() : Coach(), I_AC {
    override val totalCapacity: Int = 24
    override var temperature: Int = 27
}