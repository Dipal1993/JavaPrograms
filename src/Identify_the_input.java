/*Enter any value and the find out if it is number (0-9) or an alphabet or symbol*/
import java.util.Scanner;
public class Identify_the_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter character : ");
        char input = scanner.next().charAt(0);
        if(Character.isDigit(input))// isdigit is method of character to check the input
        { System.out.println("Input is a digit (0-9)"); }
        else if (Character.isLetter(input))//isLetter is method for check the input
        { System.out.println("Input is an alphabet.");}
        else
        { System.out.println("Input is a symbol.");}
    }
}
