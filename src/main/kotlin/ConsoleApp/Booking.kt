package ConsoleApplication

import ConsoleApplication.Store.DB
import ConsoleApplication.Trains.Train

class Booking {
    fun trainsFromSrcToDest(src: String, dest: String): MutableList<Train> {
        val trains: MutableList<Train> = mutableListOf()
        for (train in DB.listOfTrains) {
            var srcIdx: Int = -1
            var destIdx: Int = -1

            srcFound@ for (x in 0 until train.trainRoute.size - 1) {
                if (train.trainRoute[x][1] == src) {
                    srcIdx = x
                    destIdx = x + 1
                    break@srcFound
                }
            }
            destFound@ while (srcIdx != -1 && destIdx != train.trainRoute.size) {
                if (train.trainRoute[destIdx][1] == dest && srcIdx != -1) {
                    trains.add(train)
                    break@destFound
                }
                destIdx++
            }
        }
        return trains
    }

    fun bookTicketInTrain(user: User, src: String, dest: String, train: Train, list: MutableList<Person>) {
        val ticket = Ticket(user.userId, src, dest, train)
        ticket.addTravellerOnTicket(list)
        user.addTicket(ticket)
        adjustSeat(train, list.size)
    }

    private fun adjustSeat(train: Train, count: Int) {
        train.numberOfSeats = train.numberOfSeats - count
        // more implementation based on the booking interval can be done here
    }

    fun isSeatsAvailable(train: Train, count: Int): Boolean {
        if (train.numberOfSeats < count)
            return false
        return true

        // interval checking can be done here for booking
    }
}




















