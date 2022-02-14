package day08_IfStatements;

public class NameOfTheDay {
    public static void main(String[] args) {
/*
2. write a program that can display the name of the day

			number = 1 ~ 7
 */
        String day;

        int num = 2;
        if (num == 1) {
            day = "Monday";

        } else if (num == 2) {
            day = "Tuesday";
        } else {
           day = "Wednesday";
        }

        System.out.println("result = " + day);
    }
}
