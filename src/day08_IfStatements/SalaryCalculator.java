package day08_IfStatements;

public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate = 50,
                weeklyHours = 45;
        double stateTaxRate = 6.5,
                federalTaxRate = 26.2;

        //.....................................................................

        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double stateTax = salaryBeforeTax * stateTaxRate / 100;
        double fedaralTax = salaryBeforeTax * federalTaxRate /100;
        double totalTax = stateTax + fedaralTax;
        double salaryAftertax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is: $"+ salaryBeforeTax);
        System.out.println("State tax: $"+ stateTax);
        System.out.println("Federal tax: $" + fedaralTax);
        System.out.println("Total tax: $" + totalTax);
        System.out.println("Net income: $" + salaryAftertax);






































    }
}
