public class gradeCalc {
    public static void main(String[] args) {
        String personName = "Siyuan";
        double math = 62;
        double english = 34;
        double science = 83;
        double history = 56;
        double pe = 100;
        double avgGrade = (math + english + science + history + pe) / 5;
        
        char gradeletter;
        String passing;

        if (avgGrade >= 60) {
            gradeletter = 'N';
        } else if (avgGrade <= 70) {
            gradeletter = 'D';
        } else if (avgGrade <= 80) {
            gradeletter = 'C';
        } else if (avgGrade <= 90) {
            gradeletter = 'B';
        } else {
            gradeletter = 'A';
        }

        if (avgGrade >= 70) {
            passing = "not passing";
        } else {
            passing = "passing";
        }

        System.out.println("Your grade is an " + avgGrade + ". This is a " + gradeletter + ". You are " + passing + ".");
    }
}