package day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        int number = 5;

       /* if (number==1){
            System.out.println("Monday");
        }
        ......
      */


       switch (number){//to compare the numbers of 1,2,3,4,5,6,7

           case 1:
               System.out.println("Monday");
               break;//Exists the switch after executing the case block
           case 2:
               System.out.println("Tuesday");
               break;//Exists the switch after executing the case block
           case 3:
               System.out.println("Wednesday");
               break;//Exists the switch after executing the case block
           case 4:
               System.out.println("Thursday");
               break;//Exists the switch after executing the case block

           case 5:
               System.out.println("Friday");
               break;//Exists the switch after executing the case block
           case 6:
               System.out.println("Saturday");
               break;//Exists the switch after executing the case block
           case 7:
               System.out.println("Sunday");
               break;//Exists the switch after executing the case block

           default://only gets executed if none of the case blocks are matching/ can be placed anywhere
               System.out.println("Invalid");
               break;//we don't need to give break statement for the last block of the switch  in order to force the switch to exit

       }































    }
}
