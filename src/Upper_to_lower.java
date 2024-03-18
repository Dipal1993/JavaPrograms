import java.util.Scanner;
public class Upper_to_lower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//take input from user
        System.out.println("Enter the Upper Case Alphabet: ");
        String input= scanner.next();//variable to store user enter value
        String Result;
        if(input.length()== 1)//check the user enter only one character or more
        { Result = input.toLowerCase();//toLowerCase method for convert the character
        System.out.println("The lowercase of " +input+  " is " +Result); }
        else {
            System.out.println("Please enter only one Alphabet in Uppercase");
        }
    }
}
