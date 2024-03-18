/*Write Java program to allow the user to input his/her age. Then the program will show if the
person is eligible to vote. A person who is eligible to vote must be older than or equal to 18 years
old.*/
import java.util.Scanner;
public class Voting_Eligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age = scanner.nextInt();
        if(age>=18)// if condition for checking age is more than 18 years or not
        { System.out.println("Your are eligible for vote"); }
        else
        { System.out.println("Your are not eligible for vote"); }
    }
}
