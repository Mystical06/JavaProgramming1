package day37_Inheritance.animal;

public class Parrot extends Animal{
    public Parrot(String name, String breed, char gender, int age, String size, String colour) {
        super(name, breed, gender, age, size, colour);
    }

    public void fly(){
        System.out.println(name + " is flying.");
    }


}
