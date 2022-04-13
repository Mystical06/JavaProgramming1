package day32_Constructors;

public class Test {

    public Test (){
        System.out.println("A");
    }
    public Test (int a){
        this();
        System.out.println("B");
    }

    public Test (double a){
        this(10);
        System.out.println("C");
    }

    public Test (String str){
        this(2.5);
        System.out.println("D");
    }


    public static void main(String[] args) {
        Test obj = new Test("Java");
    }









}
