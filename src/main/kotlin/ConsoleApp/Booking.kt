package ConsoleApp

import ConsoleApp.Store.DB
import ConsoleApp.Trains.Train
import ConsoleApplication.User

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
        train.decrementSeat(list.size)
    }
}




















