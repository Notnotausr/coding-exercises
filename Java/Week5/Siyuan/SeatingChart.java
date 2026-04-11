public class SeatingChart {
    public static void main(String[] args) {
        String[][] seatChart = {
            {"Ana", "Bo"},
            {"Cy", "Dee"},
            {"Eli", "Fox"}
        };
        // print every name that starts with A
        for (int r = 0; r < seatChart.length; r++){
            for (int c = 0; c < seatChart[r].length; c++){
                if (seatChart[r][c].startsWith("A")) {
                    System.out.println(seatChart[r][c]);
                }
            }
        }
            
    }
}
