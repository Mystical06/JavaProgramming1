package week03;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// create scanner object

        //Declare 5 variables, for this we need to create scanner object

        double num1, num2, num3, num4, num5, total;
        System.out.println("Enter 4 numbers");
        num1 = scan.nextDouble();  // initialize variable  with the user input
        System.out.println("num1 = " + num1);
        num2 = scan.nextDouble();
        System.out.println("num2 = " + num2);
        num3 = scan.nextDouble();
        System.out.println("num3 = " + num3);
        num4 = scan.nextDouble();
        System.out.println("num4 = " + num4);


        total = num1 + num2 + num3 + num4;


        System.out.println("total = " + total);





















    }
}
