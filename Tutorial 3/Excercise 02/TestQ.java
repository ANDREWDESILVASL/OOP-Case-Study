import java.util.Scanner;

public class TestQ {
    public static void main(String[] args) {
        System.out.println("Enter the first word : ");
        Scanner scanner = new Scanner(System.in);
        String firstWord =  scanner.next();
        System.out.println("Enter the second word : ");
        String secondWord =  scanner.next();
        InterviewQuestion test = new InterviewQuestion(firstWord,secondWord);
        test.isSubstring();
    }
}
