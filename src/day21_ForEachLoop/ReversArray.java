package day21_ForEachLoop;

import java.util.Arrays;

public class ReversArray {
    public static void main(String[] args) {

        int[] numbers= {10,20,30,40};

        //              0   1  2  3

        int[] reversed = new int[numbers.length];//to make sure that new array has enough capacity to contain all the elements of first array

        System.out.println(Arrays.toString(reversed));


       //        j            i
        reversed[0] = numbers[numbers.length-1];// numbers[3]//40
        reversed[1] = numbers[2]; // 30
        reversed[2] = numbers[1]; // 20
        reversed[3] = numbers[0]; // 10
        System.out.println(Arrays.toString(reversed));

        for (int i = numbers.length - 1, j=0 ; i >= 0; i--, j++) {
            reversed[j]=numbers[i];

        }
        System.out.println(Arrays.toString(reversed));





















    }
}
