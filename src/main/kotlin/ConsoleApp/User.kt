package ConsoleApp

class User(userId: String, fullName: String, age: Int, gender: Char) {
    var userId: String
        private set
    var fullName: String
        private set
    var age: Int
        private set
    var gender: Char
        private set
    var tickets: MutableList<Ticket>
        private set

    init {
        this.userId = userId
        this.fullName = fullName
        this.age = age
        this.gender = gender
        this.tickets = mutableListOf()
    }

    fun addTicket(ticket: Ticket) {
        this.tickets.add(ticket)
    }

    fun printTicketDetails(ticket: Ticket) {
        println("<------- Ticket Details -------->")
        println("Train -> ${ticket.trainRef.trainNumber} - ${ticket.trainRef.trainName}")
        println("PNR number -> ${ticket.pnr}")
        println("Boarding Station -> ${ticket.boardingStation}")
        println("Destination Station -> ${ticket.destinationStation}")
        println("<----- Passenger's Details ----->")
        println(java.lang.String.format("%2s %15s %5s %20s", "SN", "Name", "Age", "ID Number"))
        for (i in 0 until ticket.noOfPassengers()) {
            println(
                java.lang.String.format(
                    "%2s %15s %5d %20s",
                    i,
                    ticket.listOfPassengers[i].fullName,
                    ticket.listOfPassengers[i].age,
                    ticket.listOfPassengers[i].ID
                )
            )
        }

    }

}


