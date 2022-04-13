package day30_CustomClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("BMW","X5", "Black", 2021, 45.599);

        System.out.println(car1);

        car1.start();
        car1.drive();
        car1.stop();
        System.out.println("¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦");

        Car car2= new Car();
        car2.setInfo("Honda", "Accord", "Grey", 2008, 4500);
        System.out.println(car2);

        car2.start();
        car2.drive();
        car2.stop();


        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        Car car3= new Car();
        car3.setInfo("Vauxhall", "Corsa", "Red", 2003, 1200);


        //Car[] cars = {car1,car2,car3};

        ArrayList<Car> carsList =new ArrayList<>();
        carsList.addAll(Arrays.asList(car1,car2,car3));

        for (Car each : carsList) {
            System.out.println(each.brand + ": "+ each.price);
        }

        /*
        BMW: 2005 ~ 2008
        Honda: 1995 ~ 1997
         */

        carsList.removeIf(p-> p.brand.equals("BMW") && p.year>= 2005 && p.year <=2008 );
        carsList.removeIf(p-> p.brand.equals("Honda") && p.year>= 1995 && p.year <=1997 );


























    }
}
