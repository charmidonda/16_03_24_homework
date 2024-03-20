//WAP to input student name, roll no, 3 subjects marks..and ﬁnd out total,
// percentage and result if he is pass or fail on basis of percentage (pass>=35) and also give them grade

import java.util.Scanner;
public class All_sub_result
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Name");
        String name = scanner.next();

        System.out.println("Enter Roll NO.");
        String roll_no = scanner.next();

        System.out.println("Enter 3 Subject Marks:");
        int sub1 = scanner.nextInt();
        int sub2 = scanner.nextInt();
        int sub3 = scanner.nextInt();
        int total_marks = sub1 + sub2 + sub3;
        System.out.println("Total Marks is :" + total_marks);
        double percentage = total_marks / 3;
        System.out.println("Percentage is " + percentage + "%");

        boolean result;
        if(result = sub1>=35 && sub2>=35 && sub3>=35)
        {
            System.out.println("Result: Pass");
        }
        else
        {
            System.out.println("Result: Fail");
        }

        String grade;
        if (percentage >= 80)
        {
            grade = "A+";
        } else if (percentage >= 60)
        {
            grade = "A";
        } else if (percentage >= 50)
        {
            grade = "B";
        } else if (percentage >= 35)
        {
            grade = "C";
        } else
        {
            grade = "Fail";
        }
        System.out.println("Grade:" + grade);

    }
}