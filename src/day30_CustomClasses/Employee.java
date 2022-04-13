package day30_CustomClasses;

public class Employee {

    public String name;
    public int ID;
    public char gender;
    public String jobTitle;
    public double salary;
    public boolean isFullTime;


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void setInfo (String name, int ID, char gender, String jobTitle, double salary, boolean isFullTime) {
        this.name = name;
        this.ID = ID;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;





    }

    public void work(){
        System.out.println(name + " is working");
    }
    public void atBreak (){
        System.out.println(name + " is at brake");
    }




}
/*
Employee Class:
		Attributes:
			name, id, gender, jobTitle, salary, isFullTime(boolean)
		Actions:
			toString(): to be able to print each employee object
			setInfo(): to be able to set all the attributes
			work()...
 */