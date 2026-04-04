
import java.util.Random;
import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(1000) + 1; // Random number between 1 and 1000
        int guess = 0;

        System.out.println("Guess a number between 1 and 1000:");
        guess = input.nextInt();
       
        int guesses = 1;

        // loop implementation here
        while (guess != number) {
            if (guess < number) {
                System.out.println("your number was too small");
            } else {
                System.out.println("your number was too large");
            }
         System.out.println("Guess a number between 1 and 1000:");
         guess = input.nextInt();


            guesses++;
        }
        System.out.println("you got the number in " + guesses + " tries");
        input.close();
    }
}