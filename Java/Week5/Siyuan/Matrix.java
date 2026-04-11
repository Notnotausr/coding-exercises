public class Matrix{
    public static void main(String[] args) {
        String[][] seatChart = {
            {"Ana", "Bo"},
            {"Cy", "Dee"},
            {"Eli", "Fox"}
        };

        for (int i = 0; i < seatChart.length; i++){

        
            for (int k = 0; k < seatChart[i].length; k++){
                if (seatChart[i][k].charAt(0) == 'A') {
                    System.out.println(seatChart[i][k]);
                }
            }
            
        }
    }
}