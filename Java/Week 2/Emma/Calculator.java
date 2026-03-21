public class Calculator {

    /* This class provides arithmetic operations */

    /* Adds two integers */
    public int add(int a, int b) {
        return a + b;
    }

    /* Subtracts the second integer from the first */
    public int subtract(int a, int b) {
        return a - b;
    }

    /* Multiplies two integers */
    public int multiply(int a, int b) {
        return a * b;
    }

    /* Divides the first integer by the second */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

    /* Returns the remainder of the division of the first integer by the second */
    public int mod(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Modulus by zero is not allowed.");
        }
        return a % b;
    }

    /* Main method for testing and printing results of Calculator class */
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition: " + calc.add(5, 3)); // Output: 8
        System.out.println("Subtraction: " + calc.subtract(5, 3)); // Output: 2
        System.out.println("Multiplication: " + calc.multiply(5, 3)); // Output: 15
        System.out.println("Division: " + calc.divide(5, 3)); // Output: 1
        System.out.println("Modulus: " + calc.mod(5, 3)); // Output: 2
    }

}
