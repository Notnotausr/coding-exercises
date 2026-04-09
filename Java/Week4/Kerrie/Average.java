public class Average {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2073; i <= 19735; i++) {
            sum += i;
        }
        int length = 19735 - 2073;
        System.out.println(sum / length);
    }
}