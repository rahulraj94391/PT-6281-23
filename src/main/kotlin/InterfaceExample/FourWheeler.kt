package InterfaceExample

abstract class FourWheeler(): IMoveable,IEngine {
    abstract var manufacturer: String protected set
    abstract var modelNo: String protected set
    abstract var color: String protected set
    abstract var hasAC: Boolean protected set
    abstract var price: Double protected set

    open fun Wheel(): String? {
        return "4 wheeler"
    }

    open fun CheckAC(): String? {
        return "AC is available"
    }

    open fun CallFacility(): String? {
        return "Call four wheeler Facility supported"
    }
}