//WAP to input any two numbers and then print their interchanged value

import java.util.Scanner;
public class Swapping_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter No1:");
        float No1 = scanner.nextFloat();
        System.out.println("Enter No2");
        float No2 = scanner.nextFloat();
        float blank = No1;
        No1 = No2;
        No2 = blank;
        System.out.println("Value of No1 : "+No1);
        System.out.println("Value of No2 : "+No2);


    }
}
