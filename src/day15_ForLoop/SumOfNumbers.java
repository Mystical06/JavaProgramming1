package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        //3. Write a program that can calculate the sum of all integers between 1 and 100

        int sum=0;

        for (int i= 1; i<= 100; i++){
            sum +=i;

        }
        System.out.println(sum);


        System.out.println("{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}");

        int total= 0;
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter a Number");
            total += scan.nextInt();
        }
        System.out.println(total);

scan.close();

    }

}
