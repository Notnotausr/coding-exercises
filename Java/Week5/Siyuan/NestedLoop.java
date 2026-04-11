public class NestedLoop{
    public static void main(String[] args) {
        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int sum = 0;
        for (int i = 0; i < grid.length; i++){
            for (int k = 0; k < grid[i].length; k++){
                sum += grid[i][k];
                }
            }
        System.out.println(sum);
        }
    }