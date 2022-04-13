package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {

        //******trim() method****

        String str1 = "    batch 25          ";
        str1 = str1.trim();//"batch 25"

        System.out.println(str1);

        //***** indexOf() method*****

        String str2 = "Cydeo School";

        int n1 = str2.indexOf("h");
        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("o");//finds the first o: fourth character
        System.out.println("n2 = " + n2);

        int n3 = str2.indexOf("ool");//finds the second o: 9th character
        System.out.println("n3 = " + n3);

        String str3 = "Java Programming language";
        int n4 = str3.indexOf("a");
        System.out.println("n4 = " + n4);

        int n5 = str3.indexOf("amm");
        System.out.println("n5 = " + n5);

        int n6 = str3.indexOf("an");
        System.out.println("n6 = " + n6);

        int n7 = str3.indexOf("gua");
        System.out.println("n7 = " + n7);
        System.out.println("--------------------------------------------------------------");

        //***** lastIndexOf()*********

        int n8 = str3.lastIndexOf("g");
        System.out.println("n8 = " + n8);

        System.out.println("*******************************************************************");

        String s = "Java Nova Cava Wawa orange";

        int firstA = s.indexOf("a");// 1st char
        System.out.println("firstA = " + firstA);

        int lastA = s.lastIndexOf("a");
        System.out.println("lastA = " + lastA);

        int secondA = s.indexOf("a ");
        System.out.println("secondA = " + secondA);

        int thirdA = s.indexOf("a C");
        System.out.println("thirdA = " + thirdA);

        int fourthA= s.indexOf("ava W");
        System.out.println("fourthA = " + fourthA);

        int fifthA= s.lastIndexOf("a W");
        System.out.println("fifthA = " + fifthA);

        int sixthA =s.lastIndexOf("aw");
        System.out.println("sixthA = " + sixthA);

        int seventhA =s.indexOf("a o");
        System.out.println("seventhA = " + seventhA);

        int eightA= s.lastIndexOf("a");
        System.out.println("eightA = " + eightA);








    }
}
