package day15_ForLoop;

public class StringMethods3 {
    public static void main(String[] args) {

        //********isEmpty()*********


        String str ="";
        boolean r =str.isEmpty();
        System.out.println(r);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //*********isBlank()**********//only there is white spaces

        String str1 =" ";//there is a space
        boolean r2 =str.isBlank();
        System.out.println(r2);

        String str3 ="Cydeo   ";
        boolean r4= str3.isBlank();
        System.out.println(r4);
        System.out.println("****************************************************************************************");


        //***********equalsIgnoreCase()*************>>>>> ignores case sensitivity "java"="JAVA"="Java"=...

        String s1= "CYDEO";
        String s2 ="cydeo";
        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true

        System.out.println("yES".equalsIgnoreCase("YES"));


        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        //*************contains()****************
        String sentence = "My favorite programming language is Java";
        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava= sentence.contains("Java");
        boolean hasJava2= sentence.contains("java");
        boolean hasJava3= sentence.toLowerCase().contains("java");
        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<=>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        String input1 ="I love Java";
        String input2 ="Java";
        System.out.println(input1.equals(input2));
        System.out.println(input1.equalsIgnoreCase(input2));
        System.out.println(input1.toLowerCase().contains("java"));//true
        System.out.println(input1.toUpperCase().contains("JAVA"));//true

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        //*************startsWith()******************>>>>>>>>>>>>you can check more charters than charAt() method

        String a= "Wooden Spoon";
        boolean x = a.startsWith("Woo");
        boolean y = a.endsWith("Spoon");
        boolean z = a.toLowerCase().endsWith("spoon");/* in order to ignore case sensitivity we should first create
                                                        the lower case/upper case version of string and then compare it
                                                        with lower case/upper case!!!*/

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);






    }
}
