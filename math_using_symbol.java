//WAP to input enter any two number and ask user to enter their symbol (+, -, /, *) find addition,
//subtraction, multiplication and division according to their symbol (using if else)
import java.util.Scanner;

public class math_using_symbol
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the First Number");
        int num1= scanner.nextInt();

        System.out.println("Enter the Second Number");
        int num2= scanner.nextInt();

        System.out.println("Enter the symbol +, -, /, or * :");
        char symbol=scanner.next().charAt(0);
        float result;

        //performed operation based on symbol with if-else statements
        if (symbol== '+')
        {
            result= num1 + num2;
            System.out.println("Addition of given numbers is: "+ result);
        }
            else if (symbol=='-')
            {
                result= num1 - num2;
                System.out.println("subtraction of given numbers is: "+ result);
            }
            else if (symbol=='/')
            {
                result= num1 / num2;
                System.out.println("Division of given numbers is: "+ result);
            }
            else if (symbol=='*')
            {
                result= num1 * num2;
                System.out.println("Multiplication of given numbers is: "+ result);
            }
        else
        {
            System.out.println("Invalid Symbol");
        }
    }
}