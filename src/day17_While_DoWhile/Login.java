package day17_While_DoWhile;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        //username: "Cydeo"
        //Password: "Cydeo123"
        Scanner scan=new Scanner(System.in);

        String username="Cydeo";
        String password= "Cydeo123";


        //while(invalid && hasAttempts)
        System.out.println("Please enter your username:");
        String usrnme=scan.nextLine();
        System.out.println("Please enter your password");
        String psswrd=scan.nextLine();
        if (usrnme.equals("Cydeo") && psswrd.equals("Cydeo123") ){
            System.out.println("Logged in");
        } else {

        }int attempt=3;

        while (!(usrnme.equals("Cydeo") && psswrd.equals("Cydeo123")) && attempt>0){//while the credentials are invalid and user has attempts
            if (attempt==1){
                System.out.println("THIS IS YOUR LAST ATTEMPT! IF YOU FAIL AGAIN, YOUR ACCOUNT WILL BE LOCKED!");
            }

            System.out.println("Incorrect user name or password, please re-enter");
            System.out.println("Please enter your username:");
            psswrd=scan.nextLine();

            System.out.println("Please enter your password");
            psswrd=scan.nextLine();
            attempt--;
        }
        if (usrnme.equals("Cydeo") && psswrd.equals("Cydeo123") ){
            System.out.println("Logged in");
        } else {
            System.out.println("Your account is locked.");
        }




        scan.close();

    }
}
/*
2. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials
                and if all three attempts are failed, then print "Your account is locked."
 */