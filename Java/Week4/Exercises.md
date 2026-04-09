# Week 4 Access/Inheritance Exercises
#### Due on 4/11 by 3PM
## Exercise 1: Account & User Access
### Instructions:
1. Create a class BankAccount in one Java file:
* Fields:
  * `private double balance`
  * `protected String accountType`
  * `private String password`
  * `protected String username`
* Add public methods to:
  * Deposit money
  * Withdraw money
  * Set the password
  * Get the username
  * Get the balance
2. Create a subclass `SavingsAccount` in a separate Java file:
  * Add a field `interestRate`
  * Add a method to calculate new balance with interest
  * Use `accountType` directly
  * Do not access `balance` or `password` directly; use the appropriate methods instead
3. Create a `TestAccess` class in a separate Java file:
  * Create a `BankAccount` object and call its methods
  * Print the `username` and `accountType` directly
  * Try accessing `balance` and `password` directly (observe what works and what doesn’t)
  * Use public methods to access the private fields

## Exercise 2: Vehicle System
### Create:
* `Vehicle`
  * fields: `brand`, `speed`
  * method: `displayInfo()`
* `Car extends Vehicle`
  * adds `numDoors`
* `Bike extends Vehicle`
  * adds `type`
### Tasks:
* Initialize all fields using constructors
* Use super to reuse the parent constructor
* Override displayInfo() in both subclasses
* Print customized output for each

## Exercise 3: Animal Hierarchy
### Create:
* `Animal`
  * method `eat()`
* `Mammal extends Animal`
  * method `walk()`
* `Dog extends Mammal`
  * method `bark()`
### Tasks:
* Create a `Dog` object
* Call all three methods (`eat`, `walk`, `bark`)
* Add a field in each class (e.g. `type`, `hasFur`, `breed`)
* Print all inherited fields from the `Dog` class
