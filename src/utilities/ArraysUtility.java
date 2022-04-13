package utilities;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysUtility {

    //prints each integer of an integer array in separate lines
    public static void printEachElementElement(int[] array){
        for (int each : array) {
            System.out.println(each);
        }
    }

    
    //prints each decimal numbers of a double array in separate lines
    public static void printEachElement(double[] array){
        for (double each : array) {
            System.out.println(each);
        }
    }

    
    //prints each char of a char array in separate lines
    public static void printEachElement(char[] array){
        for (char each : array) {
            System.out.println(each);
        }
    }


    //prints each string of a string array in separate lines
    public static void printEachElement(String[] array){
        for (String each : array) {
            System.out.println(each);
        }
    }


    //returns the maximum number for integer
    public static int maxNumber(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    //returns the maximum number for decimal numbers
    public static double maxNumber(double[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }


    //returns the minimum number of the array
    public static int minNumber(int[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }


    //returns the minimum decimal number of the array
    public static double minNumber(double[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }


    //checks if the given integer is contained in the given array, returns boolean. ===> contains(int[], int)
    public static boolean contains (int[] array, int element){
        //                           {1,2,3,4},       6
        
        boolean result=false;
        for (int each : array) {
            if (each==element){
                result=true;
            }
        }
        return result;
    }

    
    //checks if the given double is contained in the given array, returns boolean. ===> contains(double[], int)
    public static boolean contains (double[] array, double element){
        //                           {1,2,3,4},       6

        boolean result=false;
        for (double each : array) {
            if (each==element){
                result=true;
            }
        }
        return result;
    }


    //checks if the given char is contained in the given array, returns boolean. ===> contains(char[], int)
    public static boolean contains (char[] array, char element){
        
        boolean result=false;
        for (char each : array) {
            if (each==element){
                result=true;
            }
        }
        return result;
    }


    //checks if the given string is contained in the given array, returns boolean. ===> contains(String[], int)
    public static boolean contains (String[] array, String element){

        boolean result=false;
        for (String each : array) {
            if (each==element){
                result=true;
            }
        }
        return result;
    }



    //adds the given element to array, returns a new array
    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];
        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }


    //adds the given element to array, returns a new array
    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];
        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }


    //adds the given element to array, returns a new array
    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];
        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }


    //adds the given element to array, returns a new array
    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];
        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }


    // returns the frequency of the given element from the given array
    public static int frequencyOfElement (int[] array, int element){
        int count=0;
        for (int each : array) {
            if (each== element){
                count++;
            }
        }
        return count;
    }


    // returns the frequency of the given element from the given array
    public static int frequencyOfElement (double[] array, double element){
        int count=0;
        for (double each : array) {
            if (each== element){
                count++;
            }
        }
        return count;
    }


    // returns the frequency of the given element from the given array
    public static int frequencyOfElement (char [] array, char element){
        int count=0;
        for (char each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }


    // returns the frequency of the given element from the given array
    public static int frequencyOfElement (String [] array, String  element){
        int count=0;
        for (String each : array) {
            if (each.equals(element)){
                count++;
            }
        }
        return count;
    }


    //returns the unique elements of the array as a new array
    public static int[] uniqueElements(int[] array){
        int[] result= {};
        for (int each : array) {

            if (ArraysUtility.frequencyOfElement(array,each) ==1){
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    //returns the unique elements of the array as a new array
    public static double[] uniqueElements(double[] array){
        double[] result= {};
        for (double each : array) {

            if (ArraysUtility.frequencyOfElement(array,each) ==1){
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //returns the unique elements of the array as a new array
    public static char[] uniqueElements(char[] array){
        char[] result= {};
        for (char each : array) {

            if (ArraysUtility.frequencyOfElement(array,each) ==1){
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //returns the unique elements of the array as a new array
    public static String[] uniqueElements(String[] array){
        String[] result= {};
        for (String each : array) {

            if (ArraysUtility.frequencyOfElement(array,each) ==1){
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //removes the index from the array, returns new array
    public static int[] removeElement(int[] array, int index){
        if (index<0 || index> array.length-1){
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }
        int[] result= new int[array.length-1];

        int j=0;
        for (int i= 0; i<array.length; i++) {//if the element of array is matching with the element at given index
            if(i==index){
                continue;//skip
            }
            result[j++]=array[i];
        }
        return result;
    }

    //removes the index from the array, returns new array
    public static double[] removeElement(double[] array, int index){
        if (index<0 || index> array.length-1){
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }
        double[] result= new double[array.length-1];

        int j=0;
        for (int i= 0; i<array.length; i++) {//if the element of array is matching with the element at given index
            if(i==index){
                continue;//skip
            }
            result[j++]=array[i];
        }
        return result;
    }

    //removes the index from the array, returns new array
    public static char[] removeElement(char[] array, int index){
        if (index<0 || index> array.length-1){
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }
        char[] result= new char[array.length-1];

        int j=0;
        for (int i= 0; i<array.length; i++) {//if the element of array is matching with the element at given index
            if(i==index){
                continue;//skip
            }
            result[j++]=array[i];
        }
        return result;
    }

    //removes the index from the array, returns new array
    public static String[] removeElement(String[] array, int index){
        if (index<0 || index> array.length-1){
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }
        String[] result= new String[array.length-1];

        int j=0;
        for (int i= 0; i<array.length; i++) {//if the element of array is matching with the element at given index
            if(i==index){
                continue;//skip
            }
            result[j++]=array[i];
        }
        return result;
    }


    // merge the given two arrays and returns the new array
    public static int[] merge(int[] arr1, int[] arr2){

        int[] result= {};

        for (int each : arr1) {
            result= ArraysUtility.addElement(result,each);
        }

        for (int each : arr2) {
            result= ArraysUtility.addElement(result,each);
        }
        return result;
    }

    // merge the given two arrays and returns the new array
    public static double[] merge(double[] arr1, double[] arr2){

        double[] result= {};

        for (double each : arr1) {
            result= ArraysUtility.addElement(result,each);
        }

        for (double each : arr2) {
            result= ArraysUtility.addElement(result,each);
        }
        return result;
    }


    // merge the given two arrays and returns the new array
    public static char[] merge(char[] arr1, char[] arr2){

        char[] result= {};

        for (char each : arr1) {
            result= ArraysUtility.addElement(result,each);
        }

        for (char each : arr2) {
            result= ArraysUtility.addElement(result,each);
        }
        return result;
    }


    // merge the given two arrays and returns the new array
    public static String[] merge(String[] arr1, String[] arr2){

        String[] result= {};

        for (String each : arr1) {
            result= ArraysUtility.addElement(result,each);
        }

        for (String each : arr2) {
            result= ArraysUtility.addElement(result,each);
        }
        return result;
    }


    //reverses the given array, returns a new array
    public static int[] reverseArray(int[] array){

        int[] result= new int[array.length];

        int j=0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] =array[i];

        }
        return result;
    }


    //reverses the given array, returns a new array
    public static double[] reverseArray(double[] array){

        double[] result= new double[array.length];

        int j=0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] =array[i];

        }
        return result;
    }


    //reverses the given array, returns a new array
    public static char[] reverseArray(char[] array){

        char[] result= new char[array.length];

        int j=0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] =array[i];

        }
        return result;
    }


    //reverses the given array, returns a new array
    public static String[] reverseArray(String[] array) {

        String[] result= new String[array.length];

        int j=0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] =array[i];

        }
        return result;
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


    //replaces all the matching old value of the array with the new value
    public static int[] replaceAllMatching (int[] array, int oldValue, int newValue){
        for (int i = 0; i < array.length; i++) {

            if (array[i]==oldValue){
                array[i]=newValue;
            }

        }
        return array;
    }


    //replaces all the matching old value of the array with the new value
    public static double[] replaceAllMatching (double[] array, double oldValue, double newValue){
        for (int i = 0; i < array.length; i++) {

            if (array[i]==oldValue){
                array[i]=newValue;
            }

        }
        return array;
    }


    //replaces all the matching old value of the array with the new value
    public static char[] replaceAllMatching (char[] array, char oldValue, char newValue){
        for (int i = 0; i < array.length; i++) {

            if (array[i]==oldValue){
                array[i]=newValue;
            }

        }
        return array;
    }


    //replaces all the matching old value of the array with the new value
    public static String[] replaceAllMatching (String[] array, String oldValue, String newValue){
        for (int i = 0; i < array.length; i++) {

            if (array[i].equals(oldValue)){
                array[i]=newValue;
            }

        }
        return array;
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


    //converts any primitive arrays to ArrayList
    public static ArrayList<Integer> convertArrayToArrayList (int[] array){
        ArrayList<Integer> list = new ArrayList<>();
        for (int each : array) {
            list.add(each);

        }
        return list;
    }
}
