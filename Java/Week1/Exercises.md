# Variable Exercises
#### Due by 3/7 at 3PM
## Exercise 1: The "Intergalactic Cargo Manager"
You have been hired as a Junior Coder for SpaceX-Z. Your job is to write a program that calculates the costs and logistics for a cargo ship traveling from Earth to Mars.
Create a single Java class file named CargoPlanner.java. Inside the main method, you must declare and initialize variables for the following data points:
1. The Ship's Name: (Choose any name).
2. Distance to Mars: 54.6 million kilometers (use a type that handles large whole numbers).
3. Fuel Level: 75.5% (use a floating-point type).
4. Number of Astronauts: 7.
5. Mission Successful: A true/false flag.
Using the variables you created, perform the following operations and print the results to the console:
• Update Fuel: The ship just used 12.2% of its fuel. Subtract this from your fuel variable.
• Split the Distance: If the trip is split into 3 equal legs, how many kilometers is each leg? (Store this in a new double variable).
• Passenger Capacity: Each astronaut needs 1.5kg of food per day. Calculate the total food needed for the crew for 1 day.


## Exercise 2: Student Grade Calculator
Create a program that:
1. Sets the person's name
2. Sets 5 test scores
3. Calculates and prints the person's name, the average grade as a letter and number, and if it is passing (must use variables for the previous information)

## Optional Challenge Exercise: Bank Account Growth Simulator

Create a program that simulates a bank account over one month using fixed values.

### Setup

Declare and assign the following variables:

```java
String accountHolder = "Avery Morgan";
double startingBalance = 2500.00;

double monthlyDeposit = 400.00;
double monthlyExpenses = 925.50;

double annualInterestRate = 3.6;  // percent
double monthlyServiceFee = 12.00;

int savingsGoal = 3000;
```

### Program Requirements

#### Deposit and Expenses

* Add the monthly deposit to the balance.
* Subtract the monthly expenses.
* Subtract the monthly service fee.

Store the result in:

```java
double balanceAfterTransactions;
```

#### Monthly Interest

* Convert the annual interest rate to a monthly rate.
* Convert percent to decimal.
* Calculate one month of interest.
* Add that interest to the balance.

Store:

```java
double interestEarned;
double finalBalance;
```

#### Goal Tracking

Calculate:

```java
double amountAwayFromGoal;
double percentageOfGoalReached;
```

Where:

* `amountAwayFromGoal` = goal − final balance
  (This may be negative if the goal was exceeded.)
* `percentageOfGoalReached` = (final balance / goal) × 100

#### Financial Summary Values

Calculate:

```java
double totalMoneyAdded;
double totalMoneyRemoved;
double netChange;
```

Where:

* totalMoneyAdded = deposit + interest
* totalMoneyRemoved = expenses + service fee
* netChange = finalBalance − startingBalance

### Output Must Include

Print:

* Account holder
* Starting balance
* Balance after transactions
* Interest earned
* Final balance
* Amount away from goal
* Percentage of goal reached
* Net change for the month
