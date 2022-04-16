package day39_Recap.shapeTask;

public class ShapeObjects {
    public static void main(String[] args) {

        Square square1 = new Square(12.6);

        System.out.println(square1);

        System.out.println( "Area: " +  square1.area());
        System.out.println( "Perimeter: " + square1.perimeter());


        System.out.println("=====================================================================================");


        Rectangle rectangle = new Rectangle(15,10);

        System.out.println(rectangle);


        System.out.println("****************************************************************************************");



        Circle circle = new Circle(13);

        System.out.println(circle);



































    }







}
