package day12_Scanner;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your score");
        int num1= scan.nextInt();
        scan.close();
        String result= "";
        if (num1>=0 && num1<=100){

            result= (num1<=59)?"F"  :(num1<=69)?"D" :(num1<=79)? "C" :(num1<=89)?"B" :"A";
        }else {
            result="Invalid Score!";
        }
        System.out.println(result);


        /*
        2. GradeReport:
            2.1 Ask the user to enter his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score

         */































    }
}
