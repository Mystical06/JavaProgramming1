package day15_ForLoop;

import java.util.Scanner;

public class ReplaceX {
    public static void main(String[] args) {

        /*
        2. Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
         */
        System.out.println("Enter a word:");

        String str=new Scanner(System.in).next();

        String result= str.replace("x", "a").replace("X","a");

        System.out.println(result);


    }

}
