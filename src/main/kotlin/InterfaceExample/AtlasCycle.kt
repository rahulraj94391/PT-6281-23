package InterfaceExample

class AtlasCycle(color: String): TwoWheelerWithoutEngine() {
    override var manufacturer: String = "Atlas"
    override var modelNo: String = "BX34RF"
    override var color: String = "NOT_SET"
    override var price: Double = 19000.0

    init {
        this.color = color
    }

    override fun changeGear() {
        println("Bicycle gears are changing")
    }

    override fun applyBrakes() {
        println("Brakes are applied on the bicycle")
    }
}