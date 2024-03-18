/*Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel or Consonant, depending on the user input.*/
import java.util.Scanner;
public class Digit_is_Vowel_or_Consonant {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter any Alphabet : ");
        String input = scanner.next();
        if(input.length()>0 && input.length()<2) //check the length of user input
        { char alphabet = input.charAt(0);
        if ((alphabet =='a')|| (alphabet=='e')||(alphabet=='i')||(alphabet=='o')||(alphabet=='u'))
        { System.out.println("Enter alphabet is Vovel"); }
        else if ((alphabet =='A')|| (alphabet=='E')||(alphabet=='I')||(alphabet=='O')||(alphabet=='U'))
        { System.out.println("Enter alphabet is Vovel"); }
        else
        { System.out.println("Enter alphabet is Consonant"); }
        }
    }
}
