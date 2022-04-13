package day20_Arrays;

import java.sql.Array;
import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {
        char[] letters= new char[26];


       /* for (char i='A',j=0; i<='Z' && j < letters.length; i++, j++) {
            letters[j]=i;
        }
        */

        char ch = 'A';
        for (int i = 0; i < letters.length; i++, ch++) {
            letters[i] = ch;
        }
        System.out.println(Arrays.toString(letters));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        char[] letters2= new char[26];//Z~A
        char ch1='Z';

        for (int k = 0; k <letters2.length ; k++,ch1--) {
            letters2[k]=ch1;

        }
        System.out.println(Arrays.toString(letters2));

















    }
}
