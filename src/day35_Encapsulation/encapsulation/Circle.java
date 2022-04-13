package day35_Encapsulation.encapsulation;

public class Circle {

    private double radius;

    public static double pi;

    static {
        pi=3.16;
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<=0) {
            System.err.println("Invalid radius: " + radius);
            return;
        }
        this.radius = radius;
    }

    public double calcArea() {
        double area = pi * getRadius() * getRadius();
        return area;
    }

    public double calcPerimeter(){
        double perimeter = 2 * pi * getRadius();
        return perimeter;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                " pi=" + pi +
                " area =" + calcArea() + "cm2" +
                " perimeter=" + calcPerimeter() + "cm" +
                '}';
    }
}
/*
2. Create a class named Circle

			private variables:
				radius

			public variable:
				pi

		 	Encapsulate all the private fields

		 			1. radius of the circle can not be zero or negative

 			Add a constructor that can set the raidus of coircle when circle object is created

 			Methods:
 				calcArea()
 				calcPerimeter()
 				toString()

 */