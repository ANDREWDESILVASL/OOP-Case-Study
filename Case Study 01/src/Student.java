public class Student {
    private String studentId;
    private String studentName;
    private double minorAssignOne;
    private double minorAssignTwo;
    private double projectDesign;
    private double projectImplementation;
    private double finalExamResults;

    //Intiallizing the constructer
    public Student() {
        this.studentId = studentId;
        this.studentName = studentName;
        this.minorAssignOne = minorAssignOne;
        this.minorAssignTwo = minorAssignTwo;
        this.projectDesign = projectDesign;
        this.projectImplementation = projectImplementation;
        this.finalExamResults = finalExamResults;
    }

    //getters and setter methods
    public double getMinorAssignment() {
        return ((this.minorAssignOne * 0.06) + (this.minorAssignTwo * 0.09)) * 0.15;
    }

    public double getProject() {
        return ((this.projectDesign * 0.15) + (this.projectImplementation * 0.20)) * 0.35;
    }

    public double getFinalExam() {
        return this.finalExamResults * 0.5;
    }

    public double getFinalExamResults() {
        return finalExamResults;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setMinorAssignOne(double minorAssignOne) {
        this.minorAssignOne = minorAssignOne;
    }

    public void setMinorAssignTwo(double minorAssignTwo) {
        this.minorAssignTwo = minorAssignTwo;
    }

    public void setProjectDesign(double projectDesign) {
        this.projectDesign = projectDesign;
    }

    public void setProjectImplementation(double projectImplementation) {
        this.projectImplementation = projectImplementation;
    }

    public void setFinalExamResults(double setFinalExamResults) {
        this.finalExamResults = finalExamResults;
    }

    public Grade getGrade() {
        double finalMarks = getFinalExam();
        if (this.getMinorAssignment() * 100 / 15 >= 35 && this.getProject() * 100 / 35 >= 35 && this.getFinalExam() * 100 / 50 >= 50 && this.getMinorAssignment() + this.getProject() + this.getFinalExam() >= 50) {
            if (getFinalExam() > 80) return Grade.HD;
            else if (getFinalExam() > 70) return Grade.D;
            else if (getFinalExam() > 60) return Grade.CR;
            else if (getFinalExam() > 50) return Grade.C;
        } else {
            if (getFinalExam() > 50) return Grade.I;
        }
        return Grade.F;
    }
}