//4. same as above but pass or fails on the basis of..student needs to pass all the subjects
import java.util.Scanner;
public class Pass_Fail_All_subject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter English Marks:");
        double English = scanner.nextDouble();
        System.out.println("Enter Maths Marks:");
        double Maths = scanner.nextDouble();
        System.out.println("Enter Science Marks:");
        double Science = scanner.nextDouble();
        if(English>=35 && Maths>=35 && Science>=35)
        {
            System.out.println("You are pass successfully!!!");
        }else
        {
            System.out.println("You are Fail!!!");
        }
    }
}
