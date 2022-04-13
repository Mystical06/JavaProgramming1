package day21_ForEachLoop;

import java.util.Arrays;

public class SplitMethodOfString {
    public static void main(String[] args) {
        String sentence = "Wooden Spoon";

        String[] words= sentence.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        String email= "woodenspoon@cydeo.com";
        String[] word2= email.split("@");

        System.out.println(Arrays.toString(word2));
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

        String s = "Today is a nice day. Today is Monday. Today we are learning Java";
        String[] arr= s.split("\\. ");
        System.out.println(Arrays.toString(arr));





















    }
}
