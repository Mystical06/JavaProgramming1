package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        //create a variable that's capable enough to contain 5 names

        String [] myGroups;
        myGroups=new String[5];//0~4
        myGroups [0]="Gunay";
        myGroups [1]="Neira";
        myGroups [2]="Suat";
        myGroups [3]="Hulya";
        myGroups [4]="Mikael";



        //System.out.println(myGroups);//it will give hashcode so we cannot print the arrays directly
        System.out.println(Arrays.toString(myGroups));
        System.out.println("*****************************************************************************************");

        String[] days={"Monday","Tuesday","Wednesday","Thursday", "Friday","Saturday","Sunday"};
        //index:           0        1           2          3          4         5         6
        int number =5;
        if (number<1 || number>7){
            System.err.println("Invalid Number!");
            System.exit(0);
        }
        System.out.println(days[number-1]);






    }
}
