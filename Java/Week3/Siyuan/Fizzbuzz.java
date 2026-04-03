public class Fizzbuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            /* i would've done it in a way that it would concatenate the strings if they were supposed to be printed, then println it after
            for example:
            
            String string = "";
            if (i % 3 == 0) {
                string += "Fizz";
            }
            
            if (i % 5 == 0) {
                string += "Jazz";
            } 
            
            if (i % 7 == 0) {
                string += "Buzz";
            }
            
            if (i % 3 != 0 && i % 5 != 0 && i % 7 != 0) { // more efficient to use string.equals("")
                System.out.println(i);
            } else {
                System.out.println(string);
            }
            */
            
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } 
            
            if (i % 5 == 0) {
                System.out.println("Jazz");
            } 
            
            if (i % 7 == 0) {
                System.out.println("Buzz");
            }
            
            if (i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                System.out.println(i);
            }
        }
    }
}
