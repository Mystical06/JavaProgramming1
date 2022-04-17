package day39_Recap.cydeoTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    public void fixingBugs(){
        System.out.println(getJobTitle() + " " + getName() + " is fixing the bugs.");
    }

    @Override
    public void work() {
        System.out.println( getJobTitle() + " " + getName() + " is developing an application");
    }
}
/*
4. Create a subclass of Employee named Developer

            Override the work method

            Extra methods:
                fixingBugs()
 */