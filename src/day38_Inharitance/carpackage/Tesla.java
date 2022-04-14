package day38_Inharitance.carpackage;

public class Tesla extends Car {
    public Tesla(String model, int year, double price, String colour, double miles) {
        super("Tesla", model, year, price, colour, miles);
    }

    public void autoPilot(){
        System.out.printf(brand + model + " has an autopilot feature.");
    }
}
/*
3. Tesla:
					extra methods:
						autoPilot();

 */