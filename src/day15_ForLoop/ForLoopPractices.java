package day15_ForLoop;

public class ForLoopPractices {
    public static void main(String[] args) {

        /* write a program that can display numbers from 15 to 45 in the same line with a space between each number

         */

        for (int i =15; i<=45;i++){
            System.out.print(i +" ");

        }
        System.out.println();
        System.out.println("Hello");

        //write a program that can display numbers from 100 to 50 in the same line with a space between each number.

        for (int i=100; i>=50; --i){ //i: 100, 99, 98, .........50
            System.out.print(i+" ");

        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // print all the even numbers between 1~55
        for (int i=1; i<=55; i++){
            if (i % 2==0){
                System.out.print(i+" ");
            }

        }

        /*
        A~Z
        a~z
        Z~A
        z~a
         */
        System.out.println();
        for (char i='A'; i<='Z';++i){
            System.out.print(i+" ");
        }
        System.out.println();
        for (char i='a'; i<='z';++i){
            System.out.print(i+" ");
        }
        System.out.println();
        for (char i='Z'; i>='A';--i){
            System.out.print(i+" ");
        }
        System.out.println();
        for (char i='z'; i>='a';--i){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("((((((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))");

        for (char i =1; i<=500; i++){
            System.out.print(i+" ");

        }
        System.out.println();

















    }
}
