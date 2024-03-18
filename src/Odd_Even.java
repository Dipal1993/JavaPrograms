//Input any two number and find out its odd or even use turnery operator (? :)
import java.util.Scanner;
public class Odd_Even {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number");
        int number = scanner.nextInt();
        String Number = (number%2==0)? "The Given Number is Even":"The Given Number is Odd";
        System.out.println(Number);
    }
}
