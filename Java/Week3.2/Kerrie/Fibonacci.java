public class Fibonacci {
    public static void main(String[] args) {
        double n = 1;
        double nplus1 = 1;
        double nplus2 = 0;
        System.out.println(n);
        System.out.println(nplus1);
        for (int i = 0; i < 394857 - 2; i++) {
            nplus2 = n + nplus1;
            System.out.println(nplus2);
            n = nplus1;
            nplus1 = nplus2;
        }
    }
}