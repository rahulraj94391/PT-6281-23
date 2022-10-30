package ConsoleApp

import ConsoleApp.Trains.Train

class Ticket(userId: String, boardingStation: String, destinationStation: String, trainRef: Train) {
    var trainRef: Train private set
    var pnr: String private set
    var userId: String private set
    var boardingStation: String private set
    var destinationStation: String private set
    var listOfPassengers: MutableList<Person> private set

    init {
        this.trainRef = trainRef
        this.pnr = (Math.floor(Math.random() * 9000000000L).toLong() + 1000000000L).toString()
        this.userId = userId
        this.boardingStation = boardingStation
        this.destinationStation = destinationStation
        this.listOfPassengers = mutableListOf()
    }

    fun addTravellerOnTicket(list: MutableList<Person>) {
        listOfPassengers.addAll(list)
    }

    fun noOfPassengers(): Int {
        return listOfPassengers.size
    }

}