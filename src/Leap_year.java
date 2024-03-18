// WAP to input any year like 1989 and find out if it is leap year
import java.util.Scanner;
public class Leap_year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number");
        int Year = scanner.nextInt();
    if((Year % 400 == 0) || ((Year % 4 == 0) && (Year % 100 != 0)))
    {
        System.out.println("Enter Year is leap Year");
    }
    else
    {
        System.out.println("Enter Year is not leap Year");
    }
}
}
