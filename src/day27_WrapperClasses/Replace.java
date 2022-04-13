package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
       arr= replaceElement(arr,2,30);
        System.out.println(Arrays.toString(arr));

        String[] arr2 = {"Java", "Python", "C++", "Ruby"};
        replaceElement(arr2,2,"C#");

        System.out.println(Arrays.toString(arr2));



    }



    //replaces the element in the given index with the given element, returns a new array
    public static int[] replaceElement(int[] array, int index, int newElement){

        if (index<0 || index>array.length-1){
            System.err.println("Invalid index number: "+ index);
            System.exit(0);
        }


        array[index]= newElement;
        return array;
    }


    //replaces the element in the given index with the given element, returns a new array
    public static double[] replaceElement(double[] array, int index, double newElement){

        if (index<0 || index>array.length-1){
            System.err.println("Invalid index number: "+ index);
            System.exit(0);}

        array[index]= newElement;
        return array;
    }

    //replaces the element in the given index with the given element, returns a new array
    public static char[] replaceElement(char[] array, int index, char newElement){

        if (index<0 || index>array.length-1){
            System.err.println("Invalid index number: "+ index);}
        System.exit(0);

        array[index]= newElement;
        return array;
    }

    //replaces the element in the given index with the given element, returns a new array
    public static String[] replaceElement(String[] array, int index, String newElement){

        if (index<0 || index>array.length-1){
            System.err.println("Invalid index number: "+ index);
            System.exit(0);}

        array[index]= newElement;
        return array;
    }



}
/*
1. Replace Task:
		1.1 Create a method named replace that passes three parameters: integer array, integer index, integer newElement. The method replaces the element of the array at given index with the new element, and returns the new array.
				Ex:
					arr = {1,2,3,4,5};

					replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}


		1.2 Create the same functions for double arrays, char arrays, and String arrays
 */