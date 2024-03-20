//WAP input any five number and then find average of five numbers

import java.util.Scanner;
public class avarage_number
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter First Number");
        int number1= scanner.nextInt();

        System.out.println("Enter Second number");
        int number2= scanner.nextInt();

        System.out.println("Enter Third Number");
        int number3= scanner.nextInt();

        System.out.println("Enter Forth Number");
        int number4= scanner.nextInt();

        System.out.println("Enter Fifth Number");
        int number5= scanner.nextInt();

        //find the Average
        double average= (number1 + number2 + number3 + number4 + number5)/5;
        System.out.println("Average of given 5 Number is "+average);
    }
}
