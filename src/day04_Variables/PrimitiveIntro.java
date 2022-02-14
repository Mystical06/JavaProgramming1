package day04_Variables;

public class PrimitiveIntro {
    public static void main(String[] args) {
        //Age: 38 years old
        byte age = 38;
        // Weight: 160 pounds; 160 is out of byte's range, that's why we are using short's range
        short weight = 160;

        int salary = 100_000;//In order to make the number readable we are only allowed to use underscore

        long asset = 3_333_333_333L;

        //tax rate: 0.26
        float taxRate = 0.26F;
        double PI = 3.14;

char ch1 = '#';
char ch2 = 35;
        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);



        String name = "Wooden Spoon";
        String city = "McLean";
        String state = "Virginia";
        String country = "USA";
        System.out.println("name = " + name);




    }


}
