package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
        char alphabet[]=new char[26];//Z~A
        alphabet[0]='Z';

        for (char i=0, j='Z'; i< alphabet.length; i++,j--){
            alphabet[i]=j;
        }



        System.out.println(Arrays.toString(alphabet));// print whole array
        System.out.println(alphabet[0]);//print a specific element of the array





















    }
}
