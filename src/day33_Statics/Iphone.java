package day33_Statics;

public class Iphone {
    public static String brand= "Apple";
    public String model;
    public double price;
    public static String OS = "iOS";
    public String colour;
    public String size;
    public static String madeIn = "China";
    public static boolean hasBattery =true;
    public static boolean isTouchscreen= true;
    public static boolean hasFaceTime = true;

    public static void printOperatingSystem() {
        System.out.println(OS);
    }
    public void method1(){
        System.out.println(model+" : "+price);
        System.out.println(OS);
    }
}
