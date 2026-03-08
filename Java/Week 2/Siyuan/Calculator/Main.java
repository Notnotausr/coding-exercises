public class Main {
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