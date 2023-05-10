
public class SCST extends Candidate {
    private double hscAvg;

    public SCST(String name, String dob, double hscPCM, double hscAvg, double ugCgpa, double pgCgpa, int projects, boolean isFullTime, double interviewMarks, boolean isIndian) {
        super(name, dob, hscPCM, hscAvg, ugCgpa, pgCgpa, projects, isFullTime, interviewMarks);
        this.hscAvg = hscAvg;
    }

    @Override
    public boolean isEligible() {
        // Check eligibility criteria for SC and ST candidates
        if (super.isEligible() && hscAvg >= 50) {
            return true;
        } else {
            return false;
        }
    }
}
