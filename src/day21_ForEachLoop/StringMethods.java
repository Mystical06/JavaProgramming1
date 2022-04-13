package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str="Java";
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));

        for (char each : str.toCharArray()){
            System.out.println(each);
        }






    }
}
