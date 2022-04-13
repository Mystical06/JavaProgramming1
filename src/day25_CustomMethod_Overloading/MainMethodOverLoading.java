package day25_CustomMethod_Overloading;

public class MainMethodOverLoading {

    public static void main(String[] args) {// only the first main method is being printed as it is the building method
        System.out.println("String");
    }

    public static void main(int[] args) {
        System.out.println("Int");
    }

    public static void main(double[] args) {
        System.out.println("Double");
    }

    public static void main(char[] args) {
        System.out.println("Char");
    }
}



