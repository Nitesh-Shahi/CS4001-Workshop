import java.util.Scanner;
public class  GradeEvaluator {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        int grade = sc.nextInt();
        
        //ternary operator
        String result = (grade >= 40) ? "Pass" : "Fail";
        
        //formatted output using escape sequences
        System.out.println("\n\t----------Grade Report---------");
        System.out.println("\tGrade: " + grade);
        System.out.println("\tResult: " + result);
        System.out.println("\t\"Thank you for checking your result!\"");
        sc.close();
        
        
        
    }
}