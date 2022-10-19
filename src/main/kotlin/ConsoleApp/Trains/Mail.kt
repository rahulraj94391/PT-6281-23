package ConsoleApplication.Trains

import ConsoleApplication.Interfaces.Mail

class Mail(trainName: String, trainNumber: Int, trainRoute: Array<Array<String>>, numberOfSeats: Int) :
    Train(trainName, trainNumber, trainRoute, numberOfSeats), Mail {
}

