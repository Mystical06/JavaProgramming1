package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        //hourly rate, weekly hour

        int hourlyRate = 50;
        int weeklyHour = 40;
        int numberOfWeeks = 52;

int salary = hourlyRate * weeklyHour * numberOfWeeks;
        System.out.println(salary);   //shortcut to print variables is soutv
        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklyHour = " + weeklyHour);
        System.out.println("salary = $" + salary);




    }


}
