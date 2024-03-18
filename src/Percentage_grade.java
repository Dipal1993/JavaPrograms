/*WAP to input student name, roll no, 3 subjects marks and find out total, percentage and result if
he is pass or fail on basis of percentage (pass>=35) and also give them grade
>= 80 A+
>= 60 A
>= 50 B
>= 35 C */
import java.util.Scanner;
public class Percentage_grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name :");
        String Name = scanner.next();
        System.out.println("Enter Your Roll no :");
        int Roll_no = scanner.nextInt();
        System.out.println("Enter Your Science_Marks :");
        double Science = scanner.nextDouble();
        System.out.println("Enter Your English_Marks :");
        double English = scanner.nextDouble();
        System.out.println("Enter Your Maths_Marks :");
        double Maths = scanner.nextDouble();
        double Obtain_Total_Marks = Science+English+Maths;
        System.out.println("Your total marks : "+Obtain_Total_Marks);
        double percentage = ((Obtain_Total_Marks * 100) / 300);
        System.out.println("Percentage: "+percentage);
        if (percentage>= 80)
        { System.out.println("You got +A grade"); }
        else if (percentage>= 60)
        { System.out.println("You got A grade"); }
        else if (percentage>= 50)
        { System.out.println("You got B grade"); }
        else if (percentage>= 35)
        { System.out.println("You got c grade"); }
        else
        { System.out.println("You are fail"); }
    }
}
