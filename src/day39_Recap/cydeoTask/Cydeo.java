package day39_Recap.cydeoTask;

public class Cydeo {
    public static void main(String[] args) {

        Tester tester = new Tester("Ayla",29,'F',123,"SDET",110000);

        Developer developer = new Developer("Jesica", 38, 'F', 1234, "Developer", 120000);

        Teacher teacher = new Teacher("Muhtar", 29, 'M', 98, "Instructor",105000);

        Student student = new Student("Mustafa", 36, 'M', 3636, "SDET");

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(student);


        System.out.println("----------------------------------------------------------------------------------");

        developer.setAge(39);

        System.out.println(developer.getAge());

        System.out.println(developer);


        System.out.println("----------------------------------------------------------------------------------");

        developer.work();
        tester.work();
        teacher.work();

        System.out.println("----------------------------------------------------------------------------------");

        developer.eat();
        developer.drink();
        developer.sleep();
        
        developer.fixingBugs();

        System.out.println("----------------------------------------------------------------------------------");

        tester.eat();
        tester.drink();
        tester.sleep();

        tester.createTicket();

        System.out.println("------------------------------------------------------------");

        teacher.eat();
        teacher.drink();
        teacher.sleep();

        // teacher.fixingBugs();
        //  teacher.createTicket();

        System.out.println("------------------------------------------------------------");

        student.eat();
        student.drink();
        student.sleep();

        // student.fixingBugs();
        // student.createTicket();
        student.study();
        

    }
}
/*
7. Create a class named Cydeo:
            create objects of Tester, Developer,Teacher, Student

            test all the functions of each objects

            Analyze the relationships between the classes

 */