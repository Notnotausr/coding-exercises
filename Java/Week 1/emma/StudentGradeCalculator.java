public class StudentGradeCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the Student Grade Calculator! Please enter your name.");
        String name = "Emma";
        System.out.println("Please enter five tests scores of the course." + name + ", here are your test scores:");
        int score1 = 85;
        int score2 = 90;
        int score3 = 81;
        int score4 = 88;
        int score5 = 92;
        System.out.println("Calculating your average score...");
        double averageScore = (score1 + score2 + score3 + score4 + score5) / 5.0;
        System.out.println("Emma, your average score is: " + averageScore);
    }
}
    
