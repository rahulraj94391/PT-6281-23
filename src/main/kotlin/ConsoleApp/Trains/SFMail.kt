package ConsoleApplication.Trains

import ConsoleApplication.Interfaces.Mail
import ConsoleApplication.Interfaces.Superfast

class SFMail(trainName: String, trainNumber: Int, trainRoute: Array<Array<String>>, numberOfSeats: Int) :
    Train(trainName, trainNumber, trainRoute, numberOfSeats), Superfast, Mail {
}