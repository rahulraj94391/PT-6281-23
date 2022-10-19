package ConsoleApplication.Trains

import ConsoleApp.Interfaces.Mail
import ConsoleApp.Interfaces.Superfast

class SFMail(trainName: String, trainNumber: Int, trainRoute: Array<Array<String>>, numberOfSeats: Int) :
    Train(trainName, trainNumber, trainRoute, numberOfSeats), Superfast, Mail {
}