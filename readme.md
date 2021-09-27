# Flights' booking and reservation

## Java console application for booking a flights

#### Description

Console application that, in an endless loop (until you select the Exit command), provides an interface for searching and booking flights.

#### Main menu of the application

The main menu that the user sees when starting the program should have the following items:
1. **Online scoreboard**. Shows information about all flights from Kiev in the next 24 hours. The main menu is then displayed again.
2. **View flight information**. The user is prompted to enter the flight ID. Further on this flight all information is displayed - date, time, destination, number of free seats. The main menu is then displayed again.
3. **Search and flight booking**. The user is prompted to sequentially enter the following information: destination, date, number of people (how many tickets need to be bought). After that, the program must search for flights that meet the specified conditions (there must be no less free seats on the flight than the number of specified passengers). All found flights should be displayed. After that, the user can select one of the found flights by specifying its sequence number, or return to the main menu (by selecting item 0). If the user decides to book a flight, he needs to enter data (name and surname) for the number of passengers that was specified in the search.
4. **Cancel reservation**. The user is prompted to enter the booking ID. If such a booking has been found, it will be canceled. The main menu is then displayed again. The user can cancel any booking.
5. **My flights**. The user is prompted to enter the last name and first name. After that, the screen displays a list of all bookings that were made by this user or in which he is a passenger.
6. **Exit**. Application shutdown.

#### Technical requirements:
- The application should have a standard three-layer structure - that is, for each worker entity, it should have the Controller, Service and DAO classes.
- Unit tests must be written for each controller, service, and DAO class.
- To work with the console (main menu), a separate class must be created, which will refer to the necessary controllers to obtain information. Controllers can refer to services, services to DAO. There should be no direct calls from the console class to services or DAOs.
- The rest of the entities / classes must also be split into the appropriate packages.
- Java 8 features should be used wherever possible.
- In case of impossible user actions (for example, selecting a nonexistent menu item), throw your own exception class. Intercept it higher in the application to keep the program running.
- The application "database" must be stored in a text / binary file next to the application. When the application starts, the data from the files must be read into the collections that are in the DAO classes.
- The application must have a large automatically generated base of flights, which must be copied to a file and read by the application at startup.
- For this project, it is enough to make all flights fly from Kiev, only the destination will differ.
- When exiting the application, all changes should be written to the save file. When the application is restarted, the collections in the DAO must be reinitialized with the data from the save file.

#### Task block №1
- Create a class to work with the console

#### Task block №2
- Create controller, service and DAO for flights

#### Task block №3
- Create controller, service and DAO for bookings

#### Organization of the workflow:
- When executing this project, you need to configure the working environment on GitHub in such a way that the master branch is protected, and no commits can be made directly to it. You can read how to do this [here](https://dan-it.gitlab.io/fs-book/new-structure/final-project/setup.html).
- Each time, to make changes to the project, it will be necessary to create a new branch, and then a Pull Request based on the changes in it. You can read more about the process [here](https://dan-it.gitlab.io/fs-book/new-structure/final-project/pull_request.html).
- The project should be configured in such a way that any Pull Request can be merged into the master only after both other team members have looked at it and put their Approve. How to configure the repository for this is described [here](https://dan-it.gitlab.io/fs-book/new-structure/final-project/setup.html).

#### Advanced difficulty tasks:
- Create a separate class for logging, and record all user actions in a log file.
- The first step before showing the main menu is to add user authorization - the user must enter a username and password. If such a user exists, then the main menu is shown, and all work is done on behalf of this user. For example, the My Reservations menu displays information about all the reservations of the current user. One new item is added to the main menu - End Session, which logs out, after which you can enter the login and password of another user.
- Add flights not only from Kiev, but also between other cities. When searching, look for connecting flights with a waiting time of no more than 12 hours.

## License

Collision is an open-sourced software licensed under the [MIT license](LICENSE.md).

