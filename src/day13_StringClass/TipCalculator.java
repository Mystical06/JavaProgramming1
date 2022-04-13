package day13_StringClass;

import java.util.Locale;
import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Split or No Split (Yes or No)");
        String split= scan.nextLine().toLowerCase();

        System.out.println("Number of people entered: ");
        int number = scan.nextInt();

        System.out.println("Check amount: ");
        double amount = scan.nextDouble();

        System.out.println("Service quality: poor/fair/good/great/excellent: ");
        String serviceQuality = scan.nextLine().toLowerCase();

        double tipRate= (serviceQuality.equals("excellent") )? 0.25 : (serviceQuality.equals("great"))? 0.2
                : (serviceQuality.equals("good"))? 0.15 : (serviceQuality.equals("fair"))? 0.1 : 0.05;

        double totalTip= amount*tipRate;


        System.out.println("Number of people entered : " + number);
        System.out.println("total to pay:  " + amount);
        System.out.println("Total Tip : " + totalTip);

        if(split.equals("yes")){
            System.out.println("Total per person: "+ (amount/number) );
            System.out.println("Tip per person: "+ (totalTip/number) );
        }




        /*
        2. Create a class called TipCalculator, write a program for a tip calculator.
There will be different service quality benchmarks that will determine the tip given.
There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.
		Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%
	The program should display the following information based on the user input:
            Split or No split (Yes or No),
            Number of people entered: (number)
            Check amount: (number)
            Service Quality: (String)
	And display:
	    Number of people entered:
        Total to pay:
        Total tip:
        Total per person:
        Tip per person:
	Ex:
		Split or No split (Yes or No)?
		Yes
		Enter the number of people
		4
		Enter the check amount:
		476
		How was the service quality? (Excellent/Great/Good/Fair/Poor)
		Excellent
		output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75
	HINT: you will need to use .equals() method
         */


    }
}
