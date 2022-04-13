package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxNumbers {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);


        int [] numbers=new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter a number:");
            numbers[i]=scan.nextInt();// each input user enters will be assigned to the indexes of the array numbers.
        }
        System.out.println(Arrays.toString(numbers));

        int max=numbers[0];
        int min=numbers[0];

        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j]>max){
                max=numbers[j];
            }
            if (numbers[j]<min) {
                min = numbers[j];
            }
        }

        System.out.println("Maximum number is:" +max);
        System.out.println("Minimum number is:" +min);
    }
}
/*

	Task:   Write a program that asks user to enter a number 10 times:
			1. store all user entered numbers in an array
			2. find the max number
			3. find the min number
 */