package day30_CustomClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {
    public static void main(String[] args) {
       Dog dog1 =new Dog();
       dog1.name= "Lucy";
       dog1.breed = "Husky";
       dog1.age = 5;
       dog1.gender='M';
       dog1.size = "Small";
       dog1.colour = "White";

       Dog dog2 = new Dog();
       dog2.name ="ACE";
       dog2.breed ="Husky";
       dog2.age =5;
       dog2.gender ='M';
       dog2.size ="Large";
       dog2.colour ="White & Black";

       Dog dog3 = new Dog();
       dog3.setInfo("Jack", "German Shepard", 2, 'M', "Large", "Black");

       Dog dog4= new Dog();
       dog4.setInfo("Puppy", "Golden", 3,'M',"Large", "Brown");

       Dog dog5= new Dog();
       dog5.setInfo("Larry", "Poodle", 2, 'F',"Medium","Grey");


        System.out.println("?????????????????????????????????????????????????????????????????????????????????????????");

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

        ArrayList<Dog> allDogs =new ArrayList<>(Arrays.asList(dogs));
        System.out.println(allDogs);




        ArrayList<Dog> femaleDogs = new ArrayList<>(allDogs);
        femaleDogs.removeIf(p-> p.gender=='M');
        System.out.println(femaleDogs);


        ArrayList<Dog> maleDogs = new ArrayList<>(allDogs);
        maleDogs.removeIf(p-> p.gender=='F');
        System.out.println(maleDogs);





























    }
}
