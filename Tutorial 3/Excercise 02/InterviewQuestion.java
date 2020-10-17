import java.util.Scanner;

public class InterviewQuestion {
    private String s1;
    private String s2;

    public InterviewQuestion(String s1, String s2) {
        this.s1 = s1.toLowerCase();
        this.s2 = s2.toLowerCase();
    }

    public void isSubstring() {
        if(s1.length()==s2.length()){
            int matched = 0;
            int indexLast = s1.length()-1;  
            for(int i = 0; i < s1.length();i++){
                if(s1.charAt(i) == s2.charAt(indexLast-i)){
                    matched++;
                    //System.out.println(s1.charAt(i) + " next " + s2.charAt(indexLast-i));
                }
            }
            System.out.println(matched);
            if(matched==s1.length()){
                System.out.println(s1+" is a rotation of "+s2);
            }
            else {
                System.out.println("not a rotation");
            }

        }
        else {
            System.out.println("Character count doesn't matched!");
        }
    }
}
