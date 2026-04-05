public class Average {
    public static void main(String[] args) {
        int sum = 0;
        int count = 19735;
        for (int i = 2073; i <= count; i++) {
            sum += i;
        }
        double average = (double) sum / (count - 2073 + 1);
        System.out.println("The average of the numbers from 2073 to " + count + " is: " + average);
    }
    
}
