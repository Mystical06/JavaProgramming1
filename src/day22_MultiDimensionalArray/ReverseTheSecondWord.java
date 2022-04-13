package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseTheSecondWord {
    public static void main(String[] args) {

        String sentence = "I Love Java";

        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        String reverse ="";

        for (int i = words[1].length()-1; i>=0 ; i--) {//i=e,v,o,l//words[1]=love
            reverse += words[1].charAt(i);
                       //love
        }
        System.out.println(reverse);

        //sentence =sentence.replaceFirst(words[1],reverse);

        //System.out.println(sentence);
        words[1]=reverse;

        System.out.println(Arrays.toString(words));

        for (String word : words) {
            System.out.print(word + " ");
        }









    }
}
/*
Write a program that can reverse the second word of the sentence
			Ex:
				sentence = "I Love Java";

			output:
				I evoL Java
 */