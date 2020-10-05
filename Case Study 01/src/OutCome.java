import java.util.ArrayList;
import java.util.Scanner;

public class OutCome {
    private static ArrayList<Student> studentArrayList = new ArrayList<>();

    public static void main(String[] args) {
        menu:
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Enter (A) Add Student Marks");
            System.out.println("2. Enter (E) exit the programme");
            System.out.println("3. Enter (D) display the results");
            switch (scanner.next().toUpperCase()) {
                case "A":
                    Student student = new Student();

                    //Getting student details
                    System.out.println("Enter the student name : ");
                    student.setStudentName(scanner.next());
                    System.out.println("Enter the student ID : ");
                    student.setStudentId(scanner.next());

                    //Getting student marks
                    System.out.println("Enter the Minor Assignment 01 marks : ");
                    student.setMinorAssignOne(scanner.nextDouble());
                    System.out.println("Enter the Minor Assignment 02 marks : ");
                    student.setMinorAssignTwo(scanner.nextDouble());
                    System.out.println("Enter the Project Design marks : ");
                    student.setProjectDesign(scanner.nextDouble());
                    System.out.println("Enter the Project Implementation marks : ");
                    student.setProjectImplementation(scanner.nextDouble());
                    System.out.println("Enter the Final Exam marks : ");
                    student.setFinalExamResults(scanner.nextDouble());
                    studentArrayList.add(student);
                    System.out.println(studentArrayList.get(0).getProject());
                    System.out.println(studentArrayList.get(0).getFinalExamResults());
                    break;
                case "D":
                    System.out.println("**********Final Results**********");
                    System.out.println("Student Name"+"\t"+"Student ID"+"\t"+"Minor Assignment"+"\t"+"Project"+"\t"+"Final Exam"+"\t"+"Final Results");
                    for(int i = 0; studentArrayList.size()>i; i++){
                        System.out.println(studentArrayList.get(i).getStudentName()+"\t"+studentArrayList.get(i).getStudentId()+"\t"
                                        +studentArrayList.get(i).getMinorAssignment()+"\t"+studentArrayList.get(i).getProject()+"\t"+studentArrayList.get(i).getFinalExamResults()+"\t"
                                +studentArrayList.get(i).getFinalExamResults());
                    }

                case "E":
                    break menu;
                default:
                    System.out.println("Invalid Input!");

            }
        }
    }
}