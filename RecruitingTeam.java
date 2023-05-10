
// RecruitingTeam class
public class RecruitingTeam {
    public void conductInterview(Candidate candidate) {
        // Conduct the interview process
        // You can implement the interview process logic here
        // For simplicity, let's assume the interview marks are assigned randomly
        double interviewMarks = Math.random() * 100;
        candidate.setInterviewMarks(interviewMarks);
        System.out.println("Interview conducted for candidate: " + candidate.getName());
        System.out.println("Interview marks assigned: " + interviewMarks);
    }

    public double calculateFinalMarks(Candidate candidate) {
        // Calculate the final marks based on interview marks and other criteria
        // You can implement the calculation logic here
        // For simplicity, let's assume the final marks are calculated by adding interview marks to the CGPA
        double finalMarks = candidate.getUgCgpa() + candidate.getPgCgpa() + candidate.getInterviewMarks();
        return finalMarks;
    }
}
