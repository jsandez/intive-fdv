Technical test for intive-fdv

Bike Rents

For this exercise i have applied a mix of things that i have learned both in work and university. I don't apply any kind of framework for this project like spring, mockito or jpa because i understand that the focus of the exercise was to test my skills for think the project open for his extension and close for modification. Also, if you don't expect any kind of application i understood that like it has to be something that you can pull from github and run without configure nothing besides a eclipse project or some automated test like jenkins.

First of all, i think the rent types like all of them has the same behavior but different implementation. In this case, it was the way of charge the rent. So i've implemented inheritance to keep the same class of rent but change his implementation. There are 3 of them: byDay, byHour, byWeek. This is called RentType. Also, there is a Class named Rent that represents a Rent with all his params that i think that were neccesaries to make this exercise. This class contains a RentType. Also, i create a Class named User that have a List of Rents and a userId just for order. 

For the discounts, i've implemented a factory pattern that receive the price and apply the discount. It creates a Class named FamilyRental that inherate from Discounts at execution time, taking into account the amounts of rents that the user have.

The service class is the responsible for create a user with his rents and charge him. This class could have another implementation depends on the neccesities.

For the persistence, i create a Dao pattern, with a kind of queue messages that take a user with his order (rents) and push in a Queue in fifo style. Also, it shows the first element of the queue and remove them if it's neccesary to process the order and charge the user. If the user it isn't the first on the queue, it throws and exception that show who is the first user in the queue.
Keep in mind that i do a Dummy dao with just a queue of rents, so it's not persisted in a external provider, but the idea of this was that you can implement this interface and do whatever you want inside the methods of queue, dequeue and top, ie save all in a database or even in a txt file.

The tests were made with junit4 and withouth any kind of framework like mockito, so i create the objects to test all the cases. 
