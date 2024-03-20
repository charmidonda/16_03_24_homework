//Input any alphabet in uppercase and print it in lowercase

import java.util.Scanner;
public class upercase_to_lowercase {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an alphabet in uppercase: ");
        String uppercaseInput = scanner.next();
        String lowercaseOutput = uppercaseInput.toLowerCase();
        System.out.println("Alphabet in lowercase: " + lowercaseOutput);
    }
}