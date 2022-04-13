package day30_CustomClasses;

public class Car {

    public String brand;
    public String model;
    public String colour;
    public int year;
    public double price;

    public void setInfo ( String carBrand, String carModel, String carColour, int carYear, double carPrice ){
        brand=carBrand;
        model=carModel;
        colour=carColour;
        year= carYear;
        price=carPrice;


    }


    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    public void drive(){
        System.out.println("Driving " + brand + " " + model);
    }

    public void start(){
        System.out.println(brand + " " + model + " has started.");
    }

    public void stop(){
        System.out.println(brand + " " + model + " has stopped.");
    }



























}
