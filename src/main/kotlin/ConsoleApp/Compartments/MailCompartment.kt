package ConsoleApp.Compartments

class MailCompartment : Coach() {
    var payloadInKG: Int = 2000

    fun loadShipment() {
        payloadInKG--
        println("loading shipment")
    }

    fun currentPayloadCapacity(): Int {
        return payloadInKG
    }

    fun unloadShipment() {
        payloadInKG++
        println("unloading shipment")
    }
}