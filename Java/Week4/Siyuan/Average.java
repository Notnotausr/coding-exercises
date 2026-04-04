public class Average {
    public static void main(String[] args) {

        double sum = 0;

        double values = 0;

        for (double i = 2073; i <= 19735; i++) {
            sum += i;
            values++;
        }

        
        double avg = sum / values;

        System.out.println(avg);
    }
}