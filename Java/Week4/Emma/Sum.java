public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 3872; i++) {
            sum += i;
        }
        System.out.println("The sum of the first 3872 natural numbers is: " + sum);
    }
}