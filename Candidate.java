

// Candidate class
public class Candidate {
    private String name;
    private String dob;
    private double hscPCM;
    private double hscAvg;
    private double ugCgpa;
    private double pgCgpa;
    private int projects;
    private boolean isFullTime;
    private double interviewMarks;
    private boolean isIndian;

    public Candidate(String name, String dob, double hscPCM, double hscAvg, double ugCgpa, double pgCgpa, int projects, boolean isFullTime, double interviewMarks) {
        this.name = name;
        this.dob = dob;
        this.hscPCM = hscPCM;
        this.hscAvg = hscAvg;
        this.ugCgpa = ugCgpa;
        this.pgCgpa = pgCgpa;
        this.projects = projects;
        this.isFullTime = isFullTime;
        this.interviewMarks = interviewMarks;
        this.isIndian = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public double getHscPCM() {
        return hscPCM;
    }

    public void setHscPCM(double hscPCM) {
        this.hscPCM = hscPCM;
    }

    public double getHscAvg() {
        return hscAvg;
    }

    public void setHscAvg(double hscAvg) {
        this.hscAvg = hscAvg;
    }

    public double getUgCgpa() {
        return ugCgpa;
    }

    public void setUgCgpa(double ugCgpa) {
        this.ugCgpa = ugCgpa;
    }

    public double getPgCgpa() {
        return pgCgpa;
    }

    public void setPgCgpa(double pgCgpa) {
        this.pgCgpa = pgCgpa;
    }

    public int getProjects() {
        return projects;
    }

    public void setProjects(int projects) {
        this.projects = projects;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean isFullTime) {
        this.isFullTime = isFullTime;
    }

    public double getInterviewMarks() {
        return interviewMarks;
    }

    public boolean isIndian() {
        return isIndian;
    }

    public void setIndian(boolean isIndian) {
        this.isIndian = isIndian;
    }

    public boolean isEligible() {
        // Check eligibility criteria
        if (dob.compareTo("July 1999") >= 0 &&
            hscPCM >= 60 &&
            (hscAvg >= 50 || !(this instanceof SCST)) &&
            ugCgpa >= 8 &&
            pgCgpa >= 8 &&
            projects >= 2 &&
            isFullTime &&
            interviewMarks >= 35 &&
            isIndian) {
            return true;
        } else {
            return false;
        }
    }

     public void setInterviewMarks(double interviewMarks) {
        this.interviewMarks = interviewMarks;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", hscPCM=" + hscPCM +
                ", hscAvg=" + hscAvg +
                ", ugCgpa=" + ugCgpa +
                ", pgCgpa=" + pgCgpa +
                ", projects=" + projects +
                ", isFullTime=" + isFullTime +
                ", interviewMarks=" + interviewMarks +
                ", isIndian=" + isIndian +
                '}';
    }
}

