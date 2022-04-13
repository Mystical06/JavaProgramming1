package day18_Nested_Loop;

public class Shape {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("* ");
                if ( (j==i) ){
                    break;
                }
            }
            System.out.println();
        }
        System.out.println("======================================================================================");

        String result = "";

        for (int i = 0; i < 10; i++) {
            for (int j = 1; j <= 1; j++) {
                result += "* ";
                System.out.println(result);
            }
        }




    }

}
/*
Use a nested loop to print the following shape
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *
 */