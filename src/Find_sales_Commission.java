/*WAP input sales id, seller's name, sales amount, salary basic and then find this sales
commission
sales amount >= 50,000 35%
sales amount >= 30,000 20%
 >= 20,000 10%
 >= 10,000 5%
 < 10,000 2% */

import java.util.Scanner;
    public class Find_sales_Commission {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the Sales ID : ");
        int Sales_ID = scanner.nextInt();
        System.out.println("Enter the Seller Name : ");
        String Name = scanner.next();
        System.out.println("Enter the Sales Amount : ");
        double Sales_Amount = scanner.nextDouble();
        System.out.println("Enter the Basic Salary : ");
        double Basic_Salary = scanner.nextDouble();
        if(Sales_Amount>=50000)
        {
            System.out.println("Commission on £" +Sales_Amount+ " is £" +(0.35 * Sales_Amount));
        }
        else if (Sales_Amount>=30000)
        {
            System.out.println("Commission on £" +Sales_Amount+ " is £" +(0.20 * Sales_Amount));
        }
        else if (Sales_Amount>=20000)
        {
            System.out.println("Commission on £" +Sales_Amount+ " is £" +(0.10 * Sales_Amount));
        }
        else if (Sales_Amount>=10000)
        {
            System.out.println("Commission on £" +Sales_Amount+ " is £" +(0.5 * Sales_Amount));
        }
        else if (Sales_Amount<10000)
        {
            System.out.println("Commission on £" +Sales_Amount+ " is £" +(0.2 * Sales_Amount));
        }
        else
        {
            System.out.println("No commission");
        }
    }
}
