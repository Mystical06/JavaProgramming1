package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {
    public static void main(String[] args) {
        /*
        +: Addition
        -: Subtraction
        *: Multiplication
        /: Division
              in math:
              10/4= 2.5
              in Java:
              10/4=2
              10.0/4=2.5

        %: Remainder
         */
        System.out.println(10 + 20);
        System.out.println(100 - 50);
        System.out.println( 10 * 6);
        System.out.println(100 / 3);   // result normally 33.3333333 but in Java it will give an integer number: 33
        System.out.println(100.0 / 3); // now it will give a decimal number as 33.33333
        System.out.println(100d / 3);  // just adding a 'd or D' at the end of any number it will give decimal result as 33.333

        System.out.println("==========================================================================================");
        int a = 100;
        double b = a/6;  // 16.0
        System.out.println(b);

        double c = a/6d;   // 16.66666
        System.out.println(c);

        // or

        double e = (double)a/6;
        System.out.println(e);






























    }
}
