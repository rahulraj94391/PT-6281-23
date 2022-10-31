package InterfaceExample

class HondaCity(color : String) : FourWheeler() {
    override var manufacturer: String = "Honda"
    override var modelNo: String = "City"
    override var color: String = "Black"
    override var hasAC: Boolean = true
    override var price: Double = 1500000.0


    init {
        this.color = color
    }

    override fun changeGear() {
        println("Gear changed")
    }

    override fun applyBrakes() {
        println("Brakes applied")
    }

    override fun startEngine() {
        println("Engine started (CVT)")
    }

    override fun stopEngine() {
        println("Engine stopped")
    }
}
