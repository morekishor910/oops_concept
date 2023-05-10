

// Main class for testing
public class Main {
    public static void main(String[] args) {
        RecruitingTeam recruitingTeam = new RecruitingTeam();
        HRTeam hrTeam = new HRTeam();

        Candidate c1 = new Candidate("John", "August 1999", 65, 65, 8.5, 8.0, 3, true, 0);
        System.out.println(c1.toString());

        recruitingTeam.conductInterview(c1);
        double finalMarks = recruitingTeam.calculateFinalMarks(c1);
        c1.setInterviewMarks(Math.round(finalMarks));

        hrTeam.informResult(c1);
    }
}
