# Week 2 Exercises
#### Due at 3/21 @ 3PM
## Exercise 1: Modeling a Book
Create a Java program that models a **`Book`** object.
* Make a `Book` class with variables for `title`, `author`, and `pages`. Add a method called `describe()` that prints a sentence describing the book.
* Create another class with a `main` method. In `main`, create **at least two `Book` objects**, assign values to their variables, and call their `describe()` methods to display information about each book.
* **Modify one of the book’s page counts** (for example, if a new edition added pages) and print the updated value.
* Add a **constructor** to the `Book` class that allows you to set the title, author, and pages when creating a book, then use it to create a **third `Book` object** and call its `describe()` method.

## Exercise 2: The Digital Pet Creator
### The Objective
You are going to create a Pet class. This class will act as a blueprint to create different pet objects, each with its own name and energy level.
### Part 1: Defining the Class
Create a file named Pet.java. Inside, define your class with two Instance Variables:
 * String name (The pet's name)
 * int energyLevel (A number from 0 to 100)
### Part 2: The Constructor
Add a Constructor to your class. This is the special method that runs when you create a new pet. It should:
 * Take two parameters: petName and startingEnergy.
 * Assign those parameters to your instance variables (name and energyLevel).
### Part 3: Adding Behavior (Methods)
Create two methods inside your Pet class:
 * play(): This method should print a message saying the pet is playing and decrease the energyLevel by 10.
 * feed(): This method should print a message saying the pet is eating and increase the energyLevel by 15.
 * status(): This method should print the pet's current name and energy level (e.g., "Rex has 85% energy left.").
### Part 4: Testing in Main
In your Main.java file (or inside your main method):
 * Instantiate (create) at least two different Pet objects (e.g., a dog named "Buddy" and a cat named "Luna").
 * Call the status() method for both pets.
 * Make one pet play and the other pet eat.
 * Call status() again to see how their energy levels changed.
### Key Concepts to Remember
 * The Blueprint: The Pet class is the cookie cutter; the individual pets you create are the cookies.
 * Dot Notation: Use the dot (e.g., myPet.play()) to tell a specific object to perform an action.
 * Case Sensitivity: Remember that String is capitalized in Java, but int is not!
