package day08_IfStatements;

public class SingleIfStatementIntro {
    public static void main(String[] args) {
        int number = 101;
        /*  System.out.println("odd Number");
            System.out.println("Even Number");
        */
        boolean evenNumber = number%2 == 0;
        boolean oddNumber = ! evenNumber;


        if (evenNumber){

            System.out.println(number + " is even number");

        }


if (oddNumber) { // not even number

    System.out.println(number + " is odd number");
}
        System.out.println("------------------------------------------------------------------------------");
int number1 = 100;
// positive
        if (number1 >0){ // If number1 is greater than zero, then print "100 is positive"
            System.out.println(number1 + " is positive");
        }
// negative
        if (number1 < 0){ //If number1 is less than zero, then print "100 is negative"
            System.out.println(number1 + " negative");

        }

// zero
        if (number1 == 0) {
            System.out.println(number1 + " is zero");
        }





    }
}
