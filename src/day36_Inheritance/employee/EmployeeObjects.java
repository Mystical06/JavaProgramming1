package day36_Inheritance.employee;

public class EmployeeObjects {

    public static void main(String[] args) {

        Tester tester = new Tester();
        tester.setInfo("Ali", 'M', 28, "SDET", "Al0123", 110000, "Amazon");
        System.out.println(tester);
        tester.work();
        tester.test();



        Developer developer = new Developer();

        Driver driver = new Driver();

        Teacher teacher = new Teacher();













    }

}
