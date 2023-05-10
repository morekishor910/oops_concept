

public class FullTime extends Candidate {
    private boolean isFullTime;

    public FullTime(String name, String dob, double hscPCM, double hscAvg, double ugCgpa, double pgCgpa, int projects, boolean isFullTime, double interviewMarks, boolean isIndian) {
        super(name, dob, hscPCM, hscAvg, ugCgpa, pgCgpa, projects, isFullTime, interviewMarks);
        this.isFullTime = isFullTime;
    }

    @Override
    public boolean isEligible() {
        // Check eligibility criteria for full-time candidates
                if (super.isEligible() && isFullTime) {
                    return true;
                } else {
                    return false;
                }
    }
}

