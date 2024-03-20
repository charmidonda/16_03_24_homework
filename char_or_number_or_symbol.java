//Enter any value and the ﬁnd out if it is number (0-9) or an alphabet or symbol

import java.util.Scanner;
public class char_or_number_or_symbol
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char input = scanner.next().charAt(0);
        //Check character is alphabet or not
        if ((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z'))
        {
            System.out.println("The entered character is an alphabet.");
        }
        //Check character is a number (0-9) or not
             else if (input >= '0' && input <= '9')
                {
                     System.out.println("The entered character is a number.");
                }
        else
        {
            System.out.println("The entered character is a symbol.");
        }
    }
}