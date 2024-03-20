//WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
//HRA = basic salary 10%
//DA = Basic salary 8%
//TA = Basic salary 9%
//PF= Basic salary 20%
//Gross salary = basic salary + HRA + TA + DA -PF
import java.util.Scanner;

public class employee_salary
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Employee Id:");
        int employeeId= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Employee Name");
        String employeeName= scanner.nextLine();
        System.out.println("Enter Basic Salary");
        double basicsalary=scanner.nextDouble();
        double hra = basicsalary*0.10;
        double da = basicsalary*0.08;
        double ta = basicsalary*0.09;
        double pf= basicsalary*0.20;
        double grosssalary = basicsalary + hra + ta + da -pf;

        System.out.println("Emp ID: " + employeeId);
        System.out.println("Emp Name: " + employeeName);
        System.out.println("Basic Salary: " + basicsalary);
        System.out.println("HRA: " + hra);
        System.out.println("TA: " + ta);
        System.out.println("DA: " + da);
        System.out.println("PF: " + pf);
        System.out.println("Gross Salary: " + grosssalary);

    }
}