public class Calculator {
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public double subtract(double a, double b) {
        return a - b;
    }
    
    public double multiply(double a, double b) {
        return a * b;
    }
    
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
        }
        return a / b;
    }
    
    public double modulo(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot modulo by zero");
        }
        return a % b;
    }
    
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        
        // Sample calculations
        System.out.println("Calculator Sample Operations:");
        System.out.println("10 + 5 = " + myCalculator.add(10, 5));
        System.out.println("10 - 3 = " + myCalculator.subtract(10, 3));
        System.out.println("7 * 6 = " + myCalculator.multiply(7, 6));
        System.out.println("20 / 4 = " + myCalculator.divide(20, 4));
        System.out.println("2 % 3 = " + myCalculator.modulo(2, 3));
    }

}