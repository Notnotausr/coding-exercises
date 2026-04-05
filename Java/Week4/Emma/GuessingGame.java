import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(1000) +1; // random number between 1 and 1000
        int guess = 0;

        System.out.println("Guess a number between 1 and 1000:");
        guess = input.nextInt();

        //loop implentation here
        int count = 0;
        while (guess != number){
            if (guess < number){
                System.out.println("You are wrong, the number is too small. Please take another guess:");
            }
            else {
                System.out.println("You are wrong, the number is too big. Please take another guess:");
            }
            guess = input.nextInt();
            count++;
        }
        System.out.println("You are right! You took " + count + " tries");

        input.close();
        
    
    }
    
}
