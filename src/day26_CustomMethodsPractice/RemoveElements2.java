package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElements2 {

    public static void main(String[] args) {
        int[] numbers = {100, 200, 300, 400, 500, 600};
        numbers= removeElement(numbers,1);
        System.out.println(Arrays.toString(numbers));
    }

    //removes the index from the array, returns new array
    public static int[] removeElement( int[] array, int index){
        if (index<0 || index> array.length-1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        int[] result={};

        for (int i = 0; i < array.length; i++) {//i: array's index number
            if (i!=index){
              result =  ArraysUtility.addElement(result,array[i]);
            }
        }
        return result;
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = {};

        for (int each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (int each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }
}
