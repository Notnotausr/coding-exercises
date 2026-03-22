public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            String output = "";

            if (i % 3 == 0) {
                output += "Fizz";
            }
            if (i % 5 == 0) {
                if (!output.isEmpty()) {
                    output += ", ";
                }
                output += "Jazz";
            }
            if (i % 7 == 0) {
                if (!output.isEmpty()) {
                    output += ", ";
                }
                output += "Buzz";
            }

            if (output.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(output);
            }
        }
    }
}
