public class Fibonacci {
    public static void main(String[] args) {
        int number = 100; // Generate the first 100 Fibonacci numbers
    
        // first two Fibonacci numbers
        int[] fibonacci = new int[number];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        
        // generate Fibonacci numbers
        for (int i = 2; i < number; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        
        // print the Fibonacci sequence
        System.out.println("First " + number + " Fibonacci numbers:");
        for (int i = 0; i < fibonacci.length; i++) {
            System.out.println((i + 1) + ": " + fibonacci[i]);
        }
    }
}
