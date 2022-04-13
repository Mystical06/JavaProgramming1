package day18_Nested_Loop;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        String username = "Cydeo";
        String password = "WoodenSpoon";

        System.out.println("Enter your username");
        String u= scan.next();
        System.out.println("Enter your password");
        String p= scan.next();



        if (u.equals(username) && p.equals(password)){
            System.out.println(" Logged in");
        }else {
            for (int i = 1; i < 4; i++) {
                System.err.println("Incorrect username or password");
                System.out.println(username);
                u= scan.next();

                System.out.println(password);
                p= scan.next();

                if (u.equals(username) && p.equals(password)){
                    System.out.println("Logged in");
                    break;
                }
            }
            if (!(u.equals(username) && p.equals(password))) {
                System.out.println("Your account is locked, please contact support team!");
            }
        }

scan.close();






    }
}
/*

        2. You are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                            username: Cydeo
                            password: WoodenSpoon

        Ask the user to enter their credentials.
           If credentials are matched, your program should print "Logged in."
           If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials
		   and if all three attempts are failed, then print "Your account is locked."
 */