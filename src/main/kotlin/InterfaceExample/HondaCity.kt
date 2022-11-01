package InterfaceExample

class HondaCity(color: String) : FourWheeler() {
    override var manufacturer: String = "Honda"
    override var modelNo: String = "City"
    override var color: String = "NOT_SET"
    override var hasAC: Boolean = false
    override var price: Double = 1500000.0

    init {
        this.color = color
    }

    override fun CheckAC() {
        println("$modelNo has AC.")
    }

    override fun CallFacility() {
        println("Calling feature is not there in $modelNo")
    }

    override fun changeGear() {
        println("Gear changed")
    }

    override fun applyBrakes() {
        println("Brakes applied")
    }

    override fun startEngine() {
        println("CVT Engine started")
    }

    override fun stopEngine() {
        println("Engine stopped")
    }
}
