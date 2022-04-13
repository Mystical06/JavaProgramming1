package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {
        int score = 400;
        if (score >= 0 && score <= 100) {//if the score is valid

            if (score >= 60) {//if the student passes the exam
                System.out.println("Pass");
            } else {
                System.out.println("Failed");
            }
        } else {//if the score is not valid
            System.out.println("Invalid score!");
        }

        System.out.println("------------------------------------------------------------------------");

        int age = 19;
        boolean hasId = true;

        if (hasId) {


            if (age >= 21) {
                System.out.println("Eligible to buy alcohol");

            } else {
                System.out.println("Not eligible to buy alcohol");
            }


        } else {
            System.out.println("You must have an ID to buy alcohol!");
        }

        System.out.println("-------------------------------------------------------------------------");
        int number = 5;
        String day;
        if (number>= 1 && number<=7) {// if the number is a valid number (1~7)




            // 7 options
            if (number==1){
                day="Monday";
            }else if (number ==2){
                day="Tuesday";
            }  else if(number== 3){
                    day = "Wednesday";
                }else if( number == 4){
                    day = "Thursday";
                }else if(number == 5){
                    day = "Friday";
                }else if(number==6){
                    day = "Saturday";
                } else{
                    day = "Sunday";
                }
            System.out.println(day);


        } else {
            System.out.println("Invalid Number!");
        }
        System.out.println("===================================================================================");




















    }
}
