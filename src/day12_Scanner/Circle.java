package day12_Scanner;

import java.util.Scanner;

@SuppressWarnings("ALL")
public class Circle {
    public static void main(String[] args) {

        Scanner radius =new Scanner(System.in);
        String result="";
        System.out.println("Enter a decimal number between 1 to 6");
        double num =radius.nextDouble();
        radius.close();
        double num2=3.14;
        double num3=2;


        if (num>= 1 && num<=6){

            double area = num2*num*num;
            System.out.println(area);

            double perimeter= num*num2*num3;
            System.out.println(perimeter);

        }else{
            result="Invalid Number!";
        }
        System.out.println(result);
/*
1. Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius

 */

































    }
}
