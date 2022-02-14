package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {


        int num1 = +25;
        int num2 = -25;
        System.out.println(num1 < 0);
        System.out.println(num1 > 0);
        System.out.println(num2 > 0);
        System.out.println(num2 < 0);

        System.out.println("------------------------------------------------------------");
        int a = 5;
        ++a; // pre increment: increases the value by 1 right away
        System.out.println(a);
        --a; // pre decrement: decreases the value by 1 right away
        System.out.println(a);

        System.out.println("------------------------------------------------------------");
        int b = 100;
        System.out.println(++b); //pre increment: increases the value by 1 right away
        int c = 100;
        System.out.println(c++); // post increment: first passes the current value, then increases the value by 1
        System.out.println(c);
        System.out.println("------------------------------------------------------------");

        int x = 200;
        System.out.println(--x); // pre decrement: decreases the value by 1 right away
        int y = 200;
        System.out.println(y--);// post increment: first passes the current value, then decreases the value by 1
        System.out.println(y); //199


        long e = 30l;
        long f = (short) e;

        System.out.println(f);
    }
}
