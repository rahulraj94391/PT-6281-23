package ConsoleApp.Compartments

import ConsoleApp.Interfaces.I_AC

class CC : Coach(), I_AC {
    override val totalCapacity: Int = 78
    override var temperature: Int = 27

}

