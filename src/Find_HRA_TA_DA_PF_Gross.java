/* WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA -PF */
import java.util.Scanner;
public class Find_HRA_TA_DA_PF_Gross {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Employee ID :");
        int Emp_ID =scanner.nextInt();
        System.out.println("Enter the Employee Name : ");
        String Name= scanner.next();
        System.out.println("Enter the Basic Salary");
        double Basic_Salary= scanner.nextDouble();
        double HRA = Basic_Salary*0.10;
        System.out.println("HRA is : "+HRA);
        double DA = Basic_Salary*0.8;
        System.out.println("DA is : "+DA);
        double BA= Basic_Salary*0.9;
        System.out.println("BA is : "+BA);
        double PF =Basic_Salary*0.20;
        System.out.println("PF is : "+PF);
        double Gross_Salary = Basic_Salary+HRA+DA+BA+PF;
        System.out.println("Gross Salary :"+Gross_Salary);

    }
}
