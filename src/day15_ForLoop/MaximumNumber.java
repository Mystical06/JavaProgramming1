package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        //write a program that asks the user to enter for 5 times
        // return the maximum number
      int max = -2147483648;// the minimum integer number

        Scanner scan =new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a Number: ");
            int num = scan.nextInt();

            if (num > max){
                max=num;
            }
        }
        scan.close();
        System.out.println("Max Number :" + max);





















    }
}
