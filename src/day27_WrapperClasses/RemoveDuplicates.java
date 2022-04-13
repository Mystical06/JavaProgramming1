package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,2,3,3,3,3,3,4,4,4,4,4};
        arr= removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("-----------------------------------------");

        String[] words = {"Java", "Java", "Python", "C#", "Java", "Java"};
        words=removeDuplicates(words);
        System.out.println(Arrays.toString(words));


    }
    //removes duplicated elements from the given array, returns a new array
    public static int[] removeDuplicates (int[] array){

        int[] result={};

        for (int each : array) {//each represents each element of the array, not the index numbers
            if (!ArraysUtility.contains(result,each)){
              result=  ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    //removes duplicated elements from the given array, returns a new array
    public static double[] removeDuplicates (double[] array){

        double[] result={};

        for (double each : array) {//each represents each element of the array, not the index numbers
            if (!ArraysUtility.contains(result,each)){
                result=  ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    //removes duplicated elements from the given array, returns a new array
    public static char[] removeDuplicates (char[] array){

        char[] result={};

        for (char each : array) {//each represents each element of the array, not the index numbers
            if (!ArraysUtility.contains(result,each)){
                result=  ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    //removes duplicated elements from the given array, returns a new array
    public static String[] removeDuplicates (String[] array){

        String[] result={};

        for (String each : array) {//each represents each element of the array, not the index numbers
            if (!ArraysUtility.contains(result,each)){
                result=  ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }
}
