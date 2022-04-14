package day38_Inharitance.carpackage;

public class Car {
   public String brand, model;
   public int year;
   public double price;
   public String colour;
   public double miles;

    public Car(String brand, String model, int year, double price, String colour, double miles) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.colour = colour;
        this.miles = miles;
    }

    public void start(){
       System.out.println (brand + " " + model + " starts at once.");
   }

   public void drive(){
       System.out.println (brand +" "+ model + " drives fast");
   }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                ", miles=" + miles +
                '}';
    }
}
/*
carTask:
		Create a class called Car
			instance variables:
				brand, model, year, price, color, miles

				add a constructor to set all the fields

			instance methods:
				start(), drive(),toString()

		Create the following sub classes of Car:
			1. Toyota:
					extra methods:
							reliabile()

			2. BMW:
					extra methods:
						breaksDown()
						racing()

			3. Tesla:
					extra methods:
						autoPilot();


 */