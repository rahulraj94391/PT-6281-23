package ConsoleApplication

import ConsoleApp.Ticket

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
}