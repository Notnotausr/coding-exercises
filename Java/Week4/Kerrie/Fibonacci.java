class Fibonacci {
    public static void main(String[] args) {
        int numberOfFibNums = 100; // you can replace 100 with whatever number of fibonacci numbers you want that is greater than 2
        double[] fibNums = new double[numberOfFibNums];
        fibNums[0] = 1;
        fibNums[1] = 1;
        for (int i = 2; i < fibNums.length; i++) {
            fibNums[i] = fibNums[i-1] + fibNums[i-2];
        }
        for (int i = 0; i < fibNums.length; i++) {
            System.out.println(fibNums[i]);
        }
    }
}