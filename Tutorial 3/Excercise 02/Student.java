public class Student extends Person {
    private int IDNumber;
    private double theFee;
    private int grade;

    public Student(String name, int age, String gender, int IDNumber){
        super(name, age, gender);
        this.IDNumber = IDNumber;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }

    public double getTheFee() {
        return theFee;
    }

    public void setTheFee(double theFee) {
        this.theFee = theFee;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString()
    {
        return super.toString()+" ID Num :"+this.IDNumber+
                " Grade :"+this.grade+" fees :"+this.theFee;
    }
}
