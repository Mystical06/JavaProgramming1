package day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "123";

        int num = Integer.parseInt(str);//int
        System.out.println(num);

        String str2= "10.5";
        double num2= Double.parseDouble(str2);
        System.out.println(num2);

        int max=Integer.MAX_VALUE;
        int min= Integer.MIN_VALUE;

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");

        String s1= "true";
        boolean b1= Boolean.parseBoolean(s1);
        System.out.println(b1);


        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");

        String s2= "123";
        Integer x= Integer.valueOf(s2);//Integer
        int y= Integer.valueOf(x);
        System.out.println(x);
        System.out.println(y);

        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");

        //isDigit()
        char ch1= '0';
       boolean r2= Character.isDigit(ch1);
        System.out.println(r2);

        //isLetter()
        ch1='A';
        boolean r3= Character.isLetter(ch1);
        System.out.println(r3);

        //special char
        ch1='!';
        boolean r4= !Character.isLetterOrDigit(ch1);
        System.out.println(r4);

        //upperCase
        ch1='a';
        boolean r5= Character.isUpperCase(ch1);
        System.out.println(r5);

        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");

        String str1 = "ab1cde2efg3hi4";

        int sum= 0;

        for (char each : str1.toCharArray()) {
            if (Character.isDigit(each)) {
                sum+=Integer.parseInt(""+ each);

            }

        }
        System.out.println("sum = " + sum);





    }
}
