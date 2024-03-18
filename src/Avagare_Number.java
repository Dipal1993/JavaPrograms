//WAP input any five number and then find average of five numbers
    import java.util.Scanner;
    public class Avagare_Number {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the First Number");
        float No1 = scanner.nextFloat();

        System.out.println("Enter the Second Number");
        float No2 = scanner.nextFloat();

        System.out.println("Enter the Third Number");
        float No3 = scanner.nextFloat();

        System.out.println("Enter the Forth Number");
        float No4 = scanner.nextFloat();

        System.out.println("Enter the Fifth Number");
        float No5 = scanner.nextFloat();
        System.out.println("Average of five number is :"+((No1+No2+No3+No4+No5)/5));
    }
}
