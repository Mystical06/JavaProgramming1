package day11_Switch_Scanner;

public class NameOfMonth {
    public static void main(String[] args) {


      /*    1. NameOfMonth  (1~12)
            2. NumberToWord (0~9)

*/
        int num = 8;
        String nameOfTheMonth ="";
        switch (num){
            case 1:
                nameOfTheMonth="Jan";
                break;
            case 2:
                nameOfTheMonth="Feb";
                break;
            case 3:
                nameOfTheMonth= "March";
                break;
            case 4:
                nameOfTheMonth="Apr";
                break;
            case 5:
                nameOfTheMonth="May";
                break;
            case 6:
                nameOfTheMonth="June";
                break;
            case 7 :
                nameOfTheMonth="July";
                break;
            case 8:
                nameOfTheMonth="Aug";
                break;
            case 9:
                nameOfTheMonth="Sep";
                break;
            case 10:
                nameOfTheMonth="Oct";
                break;
            case 11:
                nameOfTheMonth="Nov";
                break;
            case 12:
                nameOfTheMonth="Dec";
                break;
            default:
                nameOfTheMonth="Invalid";

        }
        System.out.println("Name of the Month = " + nameOfTheMonth);






























    }
}
