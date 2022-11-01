package InterfaceExample

class ToyotaFortuner(color: String) : FourWheeler() {
    override var manufacturer: String = "Toyota"
    override var modelNo: String = "Fortuner"
    override var color: String = "NOT_SET"
    override var hasAC: Boolean = true
    override var price: Double = 3700000.0
    init {
        this.color = color
    }

    override fun CheckAC() {
        println("$modelNo has AC.")
    }

    override fun CallFacility() {
        println("Calling feature is available in $modelNo")
    }

    override fun changeGear() {
        println("Gear changed $manufacturer")
    }

    override fun applyBrakes() {
        println("Brakes applied")
    }

    override fun startEngine() {
        println("Engine started (2TR-I4)")
    }

    override fun stopEngine() {
        println("Engine stopped")
    }
}