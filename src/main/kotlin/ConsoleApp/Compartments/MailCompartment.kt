package ConsoleApp.Compartments

class MailCompartment:Coach() {
    val payload: Int = 200

    fun loadShipment(){
        println("loading shipment")
    }

    fun unloadShipment(){
        println("unloading shipment")
    }
}