/*Input any alphabet from a to f and print their city name accordingly (use if else) any other
alphabet should be invalid entry*/
import java.util.Scanner;
        public class City_Name_From_Alphabet {
        public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the only one Alphabet among A to F: ");
        String input = scanner.next();
        char alphabet;
        if(input.length()>0 && input.length()<2)
        {
            alphabet = input.charAt(0);
            if (alphabet=='A' || alphabet=='a' )
            {System.out.println("Ahmedabad");}
            else if (alphabet=='B' || alphabet=='b')
            {System.out.println("Bristol");}
            else if (alphabet=='C' || alphabet=='c')
            {System.out.println("Cardiff");}
            else if (alphabet=='D' || alphabet=='d')
            {System.out.println("Derby");}
            else if (alphabet=='E' || alphabet=='e')
            {System.out.println("Edinburgh");}
            else if (alphabet=='F' || alphabet=='f')
            {System.out.println("Fife");}
        }else
        {System.out.println(" Invalid Entry ");}
        }
}
