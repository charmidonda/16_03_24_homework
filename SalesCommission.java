//WAP input sales id, seller's name, sales amount, salary basic and then find this sales
//commission
//sales amount >= 50,000 35%
//sales amount >= 30,000 20%
//>= 20,000 10%
//>= 10,000 5%
//< 10,000 2%


import java.util.Scanner;
public class SalesCommission
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter sales ID: ");
        int salesId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter seller's name: ");
        String sellerName = scanner.nextLine();

        System.out.print("Enter sales amount: ");
        double salesAmount = scanner.nextDouble();

        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();

        double commissionPercentage;
        if (salesAmount >= 50000)
        {
            commissionPercentage = 0.35;
        }
            else if (salesAmount >= 30000)
            {
                commissionPercentage = 0.20;
            }
            else if (salesAmount >= 20000)
            {
                commissionPercentage = 0.10;
            }
            else if (salesAmount >= 10000)
            {
                commissionPercentage = 0.05;
            }
        else
        {
            commissionPercentage = 0.02;
        }
        double commission = salesAmount * commissionPercentage;

        System.out.println("Sales ID: " + salesId);
        System.out.println("Seller's Name: " + sellerName);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Sales Commission: " + commission);
    }
}