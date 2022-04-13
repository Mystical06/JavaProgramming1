package day17_While_DoWhile;

public class FrequencyOfChar {
    public static void main(String[] args) {


        String str= "AAABBC";
        char ch ='A';

        int frequency =0;//+1+1+1==>3

        for (int i = 0; i <str.length(); i++) {// i: indexes of str

            char eachChar = str.charAt(i); // eachChar: each charter of str

            if (ch==eachChar){//if given char is matching with the eachChar, then ch is appeared in the string.

                frequency++;


            }



        }

        System.out.println("frequency = " + frequency);
    }
}
/*
1. Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3
 */