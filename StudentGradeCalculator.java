import java.util.Scanner;

public class  StudentGradeCalculator{
    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of following subject (out of 100) : ");

        System.out.println("\nEnter  marks of TELUGU: ");
        int t=sc.nextInt();
        System.out.println("Enter  marks of HINDI: ");
        int h=sc.nextInt();
        System.out.println("Enter  marks of ENGLISH: ");
        int e=sc.nextInt();
        System.out.println("Enter  marks of MATHS: ");
        int m=sc.nextInt();
        System.out.println("Enter  marks of SCIENCE: ");
        int s=sc.nextInt();
        System.out.println("Enter  marks of SOCIAL_STUDIES: ");
        int ss=sc.nextInt();

        float totalMarks = 0;
        
        totalMarks=(t+h+e+m+s+ss);
     
        float Percentage = (float)totalMarks / 600*100;

        String grade;
        if (Percentage >= 90 && Percentage<=100 ) {
            grade = "A+";
        } else if (Percentage >= 80 && Percentage<=89) {
            grade = "A";
        } else if (Percentage >= 70 && Percentage<=79) {
            grade = "B";
        } else if (Percentage >= 60 && Percentage<=69) {
            grade = "C";
        } else if (Percentage >= 36 && Percentage<=59) {
            grade = "D";
        } else if ( Percentage<=35)
        {
            grade = "F";
        }
        else
        {
            grade="out of range";
        }

        System.out.println("\n Total Marks : "+ totalMarks);
        System.out.println("\n Percentage :"+Percentage);
        System.out.println("\n Grade : "+grade);
    }
}