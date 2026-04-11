public class StarPyramid {
    public static void main(String[] args) {
        int rows = 100; // number of rows generated
        
        for (int i = 1; i <= rows; i++) {
            // print stars
            for (int k = 1; k <= (2 * i - 1); k++) { /* fancy! however it goes 1, 3, 5 etc. instead of 1, 2, 3 */
                System.out.print("*");
            }
            // move to the next line after one row is printed
            System.out.println();
        }
    }
    

}
