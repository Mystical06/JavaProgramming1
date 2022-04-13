package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        String[] group1 = {"Ali", "Layan", "Aysenur"};//3 elements
        String[] group2 = {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"};//5 elements

        String[] students= new String[group1.length + group2.length];//to make sure that this array has enough capacity to include both two arrays

        int index =0;

        for (String each : group1) {
            students[index++]=each;
        }

        for (String each : group2) {
            students[index++]=each;
        }
        System.out.println(Arrays.toString(students));

        System.out.println("________---------_______----------_________------------________----------____________-------");

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'D', 'E', 'F', 'G', 'H'};

        char[] chars = new char[ch1.length + ch2.length];

        int indx =0;

        for (char ch : ch1) {
            chars[indx++]=ch;

        }
        for (char ch : ch2) {
            chars[indx++]=ch;

        }
        System.out.println(Arrays.toString(chars));
























    }

}
