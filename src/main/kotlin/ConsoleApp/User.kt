package ConsoleApp

class User(_userId: String, _fullName: String, _age: Int, _gender: Char) {
    var userId: String
    var fullName: String
    var age: Int
    var gender: Char
    var tickets: MutableList<Ticket>

    init {
        userId = _userId
        fullName = _fullName
        age = _age
        gender = _gender
        tickets = mutableListOf()
    }

    fun addTicket(ticket: Ticket) {
        this.tickets.add(ticket)
    }

    fun printTicketDetails(ticket: Ticket) {
        println(
            """<----- Ticket Details ----->
Train -> ${ticket.trainRef.trainNumber} - ${ticket.trainRef.trainName}
PNR number -> ${ticket.pnr}
Boarding Station -> ${ticket.boardingStation}
Destination Station -> ${ticket.destinationStation}
<----- Passenger's Details ----->
SNo.  Name        Age  ID""")
        for (i in ticket.listOfPassengers.indices) {
            println("${i + 1}     ${ticket.listOfPassengers[i]}")// Implement java equal spacing in string formatting for proper printing
        }
    }
}