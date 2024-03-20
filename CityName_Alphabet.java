//Input any alphabet from a to f and print their city name accordingly (use if else) any other
//alphabet should be invalid entry

import java.util.Scanner;
public class CityName_Alphabet
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter any alphabet A to F");
        char alphabet=scanner.next().charAt(0);

        if (alphabet=='a'|| alphabet=='A')
        {
            System.out.println("City: Ahmedabad");
        }
        else if (alphabet == 'b' || alphabet == 'B')
        {
            System.out.println("City: Bombay");
        }
        else if (alphabet == 'c' || alphabet == 'C')
        {
            System.out.println("City: Chandigar");
        }
        else if (alphabet == 'd' || alphabet == 'D')
        {
            System.out.println("City: Delhi");
        }
        else if (alphabet == 'e' || alphabet == 'E')
        {
            System.out.println("City: Etawah");
        }
        else if (alphabet == 'f' || alphabet == 'F')
        {
            System.out.println("City: Faridabad");
        }
        else
        {
            System.out.println("Invalid entry");
        }
    }
}