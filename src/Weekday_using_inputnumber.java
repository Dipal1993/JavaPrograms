/* WAP input any number, the print Day name of the week accordingly by using if else*/import java.util.Scanner;
public class Weekday_using_inputnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number among 0 to 6");
        int input = scanner.nextInt();
        if(input >= 0 && input <= 6)//check the value of input
        {if(input == 0)
        { System.out.println("Today is Sunday");}
        else if (input == 1) { System.out.println("Today is Monday"); }
        else if (input == 2) { System.out.println("Today is Tuesday"); }
        else if (input == 3) { System.out.println("Today is Wednesday"); }
        else if (input == 4) { System.out.println("Today is Thursday"); }
        else if (input == 5) { System.out.println("Today is Friday"); }
        else if (input == 6) { System.out.println("Today is Saturday"); }
        else
        { System.out.println("invalid input");}
        }
    }
}
