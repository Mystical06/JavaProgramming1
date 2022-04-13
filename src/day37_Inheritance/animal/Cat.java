package day37_Inheritance.animal;

public class Cat extends Animal {

    public Cat(String name, String breed, char gender, int age, String size, String colour) {
        super(name, breed, gender, age, size, colour);
    }

    public void scratch(){
        System.out.println(name + " is scratching.");
    }
}
