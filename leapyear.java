//WAP to input any year like 1989 and ﬁnd out if it is leap year

import java.util.Scanner;

public class leapyear
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        boolean isLeapYear = isLeapYear(year);

        if (isLeapYear)
        {
            System.out.println(year + " is a leap year.");
        }
        else
        {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static boolean isLeapYear(int year)
    {
        // A year is a leap year if it is divisible by 4 but not by 100,
        // or it is divisible by 400.
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}