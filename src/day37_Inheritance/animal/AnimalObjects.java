package day37_Inheritance.animal;

public class AnimalObjects {
    public static void main(String[] args) {


        Dog dog1 = new Dog("Max", "Husky", 'M', 2, "Large", "White");
        System.out.println(dog1);
        dog1.bark();

        Cat cat1 = new Cat("Tarcin","British", 'F', 1,"Small", "Black and White");
        System.out.println(cat1);
        cat1.scratch();

        Parrot parrot1 = new Parrot("Surmeli", "African", 'F', 3, "Small", "Colourful");
        System.out.println(parrot1);
        parrot1.fly();



    }
}