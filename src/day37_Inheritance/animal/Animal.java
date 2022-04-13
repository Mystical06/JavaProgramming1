package day37_Inheritance.animal;

public class Animal {

    public String name, breed;
    public char gender;
    public int age;
    public String size, colour;

    public Animal(String name, String breed, char gender, int age, String size, String colour) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.colour = colour;
    }

    public void eat(){
        System.out.println(name + " is eating.");
    }

    public void drink(){
        System.out.println(name+ " is drinking");
    }

    public void  move(){
        System.out.println(name+ " is moving");
    }

    public void sleep(){
        System.out.println(name+ " is sleeping");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
