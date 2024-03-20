//WAP input any number, the print Day name of the week accordingly by using if else

import java.util.Scanner;
public class day_name
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-7) representing the day of the week: ");
        int dayNumber = scanner.nextInt();
        if (dayNumber == 1)
        {
            System.out.println("Day of the week is: Monday");
        }
            else if (dayNumber == 2)
            {
                System.out.println("Day of the week is: Tuesday");
            }
            else if (dayNumber == 3)
            {
                System.out.println("Day of the week is: Wednesday");
            }
            else if (dayNumber == 4)
            {
                System.out.println("Day of the week is: Thursday");
            }
            else if (dayNumber == 5)
            {
                System.out.println("Day of the week is: Friday");
            }
            else if (dayNumber == 6)
            {
                System.out.println("Day of the week is: Saturday");
            }
            else if (dayNumber == 7)
            {
                System.out.println("Day of the week is: Sunday");
            }
        else
        {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }
    }
}
