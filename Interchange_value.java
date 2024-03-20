//WAP to input any two numbers and then print their interchanged value


import java.util.Scanner;
public class Interchange_value
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number");
        int number2 = scanner.nextInt();
        int interchange = number1;
        number1 = number2;
        number2 = interchange;

        System.out.println("Interchanged values");
        System.out.println("First number: " + number1);
        System.out.println("Second number: " + number2);
    }
}