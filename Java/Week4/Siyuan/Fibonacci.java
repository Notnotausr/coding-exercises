import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        ArrayList<Double> curTerm = new ArrayList<>();
        double lastTerm = 1.0;
        double midTerm;
        int maxNumber = Integer.parseInt(args[0]);
        curTerm.add(0, 1.0);
       
        System.out.println(lastTerm);
        System.out.println(curTerm.get(0));
        for (int i = 1; i <= maxNumber; i++) {
            curTerm.add(i, curTerm.get(i-1)+lastTerm);
            lastTerm = curTerm.get(i-1);
            midTerm = curTerm.get(i);
            System.out.println(midTerm);
           
        }
    }
}
