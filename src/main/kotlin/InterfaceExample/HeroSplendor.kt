package InterfaceExample

class HeroSplendor(color: String) : TwoWheelerWithEngine() {
    override var manufacturer: String = "Hero"
    override var modelNo: String = "Splendor"
    override var color: String = "NOT_SET"
    override var price: Double = 107000.0

    init {
        this.color = color
    }

    override fun changeGear() {
        println("Gear are shifting in $modelNo.")
    }

    override fun applyBrakes() {
        println("Brakes applied")
    }

    override fun startEngine() {
        println("Engine started in $modelNo.")
    }

    override fun stopEngine() {
        println("Engine stopped")
    }
}