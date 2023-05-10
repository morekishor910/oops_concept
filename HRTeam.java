
// HRTeam class
public class HRTeam {
    public void informResult(Candidate candidate) {
        // Inform the candidate about their result
        if (candidate.isEligible()) {
            System.out.println("Congratulations, " + candidate.getName() + "! You have been selected.");
        } else {
            System.out.println("Sorry, " + candidate.getName() + ". You did not meet the eligibility criteria.");
        }
    }
}

