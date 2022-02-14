package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your hourly rate:");
        double hourlyRate= scan.nextDouble();
        System.out.println("How many hours do you work?:");
        int hours= scan.nextInt();
        System.out.println("Enter your state tax ratio:");
        double stateTaxRatio= scan.nextDouble();
        System.out.println("Enter your federal tax ratio:");
        double federalTaxRatio= scan.nextDouble();
        scan.close();
        double salary= hourlyRate*hours;
        double stateTax= stateTaxRatio*salary ;
        double federalTax= federalTaxRatio*salary;
        double totalTax= stateTax + federalTax;
        double netIncome= salary - totalTax;

        System.out.println("Salary: "+ salary);
        System.out.println("State Tax: "+ stateTax);
        System.out.println("Federal Tax: "+ federalTax);
        System.out.println("Total Tax: "+ totalTax);
        System.out.println(" Net Income: "+ netIncome);
        /*
        3. SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 stateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
         */








































    }
}
