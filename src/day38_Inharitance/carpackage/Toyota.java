package day38_Inharitance.carpackage;

public class Toyota extends Car{
    public Toyota( String model, int year, double price, String colour, double miles) {
        super("Toyota", model, year, price, colour, miles);
    }

    public void reliable(){
        System.out.printf(brand + model + " is very reliable.");
    }

@Override
    public void start(){
        System.out.println("Twist the key to ignition to start "+brand+" "+model);}

}
/*
1. Toyota:
					extra methods:
							reliable()

 */