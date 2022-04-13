package day18_Nested_Loop;

import java.util.Locale;
import java.util.Scanner;

public class NestedLoopPractice {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        while (true) {

            System.out.println("Enter your age:");
            int age = scan.nextInt();

            while (!(age >= 1 && age <= 120)) {
                System.err.println("Invalid entry, please re-enter your age");
                age = scan.nextInt();

            }
            System.out.println("Would you like to continue?");
            String ans=scan.next().toLowerCase();

            while (!(ans.equals("yes") || ans.equals("no"))){
                System.err.println("Invalid entry, please re-enter your answer");
                System.out.println("Would you like to continue?");
                ans = scan.next();
            }
            if (ans.equals("no")){
                break;
            }
        }
scan.close();


    }
}
