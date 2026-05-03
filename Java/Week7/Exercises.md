# Week 7 Generics/Collections Exercises
**Due on 5/16 by 3PM**

## Exercise 1: Library System
A library wants to store different types of items (books, DVDs, magazines) in a flexible system.

### Tasks:
1. Create a generic class `Library<T>`:
   * Use an `ArrayList<T>` to store items
   * Prevent duplicate items in the library
   * Methods:
     * `addItem(T item)`
     * `removeItem(T item)`
     * `listItems()`

2. Create simple classes:
   * `Book`
   * `DVD`

3. In `main()`:
   * Create `Library<Book>` and `Library<DVD>`
   * Add multiple items to each library
   * Print all items

## Exercise 2: Student Grade Storage
A teacher wants to store student names and their grades efficiently.

### Tasks:
1. Create a program using:
   * `HashMap<String, ArrayList<Integer>>`
   * Key = student name
   * Value = list of grades

2. Implement methods:
   * `addGrade(String student, int grade)`
   * `getAverageGrade(String student)`
   * `printAllStudents()`

3. In `main()`:
   * Add at least 3 students
   * Each student should have multiple grades
   * Print each student’s average grade
   * Find the student with the highest average

## Exercise 3: Inventory System
A store sells different types of products and needs a flexible inventory system.

### Tasks:
1. Create a base class `Product`:
   * Fields: `name`, `price`

2. Create subclasses:
   * `Electronics`
   * `Food`

3. Create a generic class `Inventory<T>`:
   * Use `ArrayList<T>`
   * Methods:
     * `addProduct(T product)`
     * `listProducts()`

4. Add a method:
   * `printAffordableProducts(List<? extends Product> products, double maxPrice)`
   * Prints products cheaper than `maxPrice`

5. In `main()`:
   * Create inventories for different product types
   * Use the wildcard method to filter products