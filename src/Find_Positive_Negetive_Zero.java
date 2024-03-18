//WAP to input any number and fid our if it is positive,negative or zero
import java.util.Scanner;
public class Find_Positive_Negetive_Zero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        if(number>0)
        { System.out.println("Given number is Positive");}
        else if (number<0)
        { System.out.println("Given number is Negative"); }
        else
        { System.out.println("Given number is 0"); }
    }
}
