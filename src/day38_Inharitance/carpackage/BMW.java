package day38_Inharitance.carpackage;

public class BMW extends Car{

    public BMW(String model, int year, double price, String colour, double miles) {
        super("BMW", model, year, price, colour, miles);
    }

    public void breaksDown(){
        System.out.printf(brand + model + "breaks down a lot.");
    }

    public void racing(){
        System.out.printf(brand + " "+ model + " is suitable for racing.");
    }

    @Override
    public void start() {
        System.out.println("Call mechanic to jump start "+brand+" "+model);
    }
}
/*
2. BMW:
					extra methods:
						breaksDown()
						racing()
 */