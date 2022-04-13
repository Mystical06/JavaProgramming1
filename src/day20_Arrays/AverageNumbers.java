package day20_Arrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AverageNumbers {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?: ");
        int lenght =scan.nextInt();

        int [] numbers=new int[lenght];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number: ");
            numbers[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

        double sum=0;
        double average=0;
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];

        }
        average=sum/lenght;
        System.out.println("Average: "+ average);
    }

}
/*
AverageNumber:
			1. Ask the user how many numbers they want to enter
			2. get all the inputs from the user and store them into an array
			3. Iterate the array & return the average number

 */