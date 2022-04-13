package day20_Arrays;

import java.sql.Array;
import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int[] numbers= {10, 9,8,20,35,7,6,1,5};

        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
