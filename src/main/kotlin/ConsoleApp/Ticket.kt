package ConsoleApp

import ConsoleApplication.Trains.Train

class Ticket(_userId: String, _boardingStation: String, _destinationStation: String, _trainRef: Train) {
    var trainRef: Train private set
    var pnr: String private set
    var userId: String private set
    var boardingStation: String private set
    var destinationStation: String private set
    var listOfPassengers: MutableList<Person> private set

    init {
        trainRef = _trainRef
        pnr = (Math.floor(Math.random() * 9000000000L).toLong() + 1000000000L).toString()
        userId = _userId
        boardingStation = _boardingStation
        destinationStation = _destinationStation
        listOfPassengers = mutableListOf()
    }

    fun addTravellerOnTicket(list: MutableList<Person>) {
        listOfPassengers.addAll(list)
    }
}