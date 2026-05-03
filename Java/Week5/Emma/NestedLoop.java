public class NestedLoop {
    public static void main(String[] args) {
        int[][] twoDArray = {
            {1, 2, 3},
            {4, 5, 6} 
        };
        int sum = 0;
        int max = 0;
        for (int r = 0; r < twoDArray.length; r++){
            for (int c = 0; c < twoDArray[r].length; c++){
                sum += twoDArray[r][c];
                if (twoDArray[r][c] > max) {
                    max = twoDArray[r][c];
                }
            }
        }
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Maximum element: " + max);
    }
}
