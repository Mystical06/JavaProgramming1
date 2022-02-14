package day05_Concatenation;
/*
1. Create a class called FullName.java
2. Declare the following variables:
1. firstName
2. lastName
 */
public class FullName {
    public static void main(String[] args) {
        String firstName = "Mustafa";
        String lastName = "Aydin";
        int age = 35;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;
        String fullName = firstName + " " + lastName;
        System.out.println("Full name of the person is " + fullName);
        System.out.println(fullName + " is " + age + " years old.");

        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName + ", and earns " + "$" + salary +" a year.");












    }
}
