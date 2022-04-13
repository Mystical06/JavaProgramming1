package day30_CustomClasses;

public class Dog {

    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String colour;

    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColour){
        name=dogName;
        breed=dogBreed;
        age=dogAge;
        gender=dogGender;
        size=dogSize;
        colour=dogColour;
    }



    public void eat(){
        System.out.println(name+ " is eating");
    }
    public void bark(){
        System.out.println(name + " is barking");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
/*
Attributes:
    name, age, gender, breed, size, color

Actions
eat(), play(), bark(),....

 */