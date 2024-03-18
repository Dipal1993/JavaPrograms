/*WAP to input enter any two number and ask user to enter their symbol (+, -, /, *) find addition,
subtraction, multiplication and division according to their symbol (using if else)*/
import java.util.Scanner;
public class Function_Symbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first Number : ");
        double No1 = scanner.nextDouble();// hold the value enter by user
        System.out.println("Enter the Second Number : ");
        double No2 = scanner.nextDouble();// hold the value enter by user
        System.out.println("Enter the Symbol : ");
        char Symbol = scanner.next().charAt(0); // hold the symbol enter by user
        if(Symbol == '+')
        { System.out.println("Addition of " + No1 + " and " + No2 + " is " +(No1+No2)); }
        else if (Symbol == '-') {System.out.println("Subtraction of " + No1 + " and " + No2 + " is " +(No1-No2));}
        else if (Symbol == '*') {System.out.println("Multiplication of " + No1 + " and " + No2 + " is " +(No1*No2));}
        else if (Symbol == '/')
        { if((No2 == 0))//check the no2 is 0 or no1>no2 the decision is not possible
            { System.out.println("Division is not possible "); }
            else{ System.out.println("Division of " + No1+ " and " + No2 + " is " +(No1/No2));} }
        else{ System.out.println("Please enter the correct symbol "); }
    }
}
