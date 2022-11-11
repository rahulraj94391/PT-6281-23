package Coupling

interface Vehicle {
    fun start()
    fun stop()
}

class Car : Vehicle {
    override fun start() {
        println("Car started")
    }

    override fun stop() {
        println("Car stopped")
    }
}


class Bike : Vehicle {
    override fun start() {
        println("Bike started")
    }

    override fun stop() {
        println("Bike stopped")
    }
}


class Traveller(_vehicle: Vehicle) {
//  Car
    private var vehicle: Vehicle

    init {
        vehicle = _vehicle
    }

    fun startTrip() {
        vehicle.start();
    }

    fun stopTrip() {
        vehicle.stop();
    }
}


fun main() {
    val bike = Bike();
    val traveller1 = Traveller(bike)
    traveller1.startTrip()
    traveller1.stopTrip()

    val car = Car();
    val traveller2 = Traveller(car)
    traveller2.startTrip()
    traveller2.stopTrip()
}



