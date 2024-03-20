//Input any two number and ﬁnd out its odd or even use turnery operator (? :)

import java.util.Scanner;
public class odd_even_using_turnery_operator
{
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            String result1 = (num1 % 2 == 0) ? "even" : "odd";
            String result2 = (num2 % 2 == 0) ? "even" : "odd";

            System.out.println("The first number is " + result1);
            System.out.println("The second number is " + result2);
        }
}
