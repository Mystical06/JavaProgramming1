package day25_CustomMethod_Overloading;
import utilities.StringUtility;
public class Test {



    public static void main(String[] args) {
        String str = "Wooden Spoon";
        StringUtility.printEachChar(str);
        System.out.println();

        System.out.println("(((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))");
        
        String s1 = "Wooden Spoon";
        String reverse = StringUtility.reverse(s1);
        System.out.println(s1);

        System.out.println("(((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))");
        
        String word= "Civic";
        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println( word +" is palindrome = " + palindrome);

        System.out.println("(((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))");

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};

        int count=0;

        for (String each : names) {

            if (StringUtility.isPalindrome(each)){
                count++;
            }

        }
        System.out.println(count);

        System.out.println("(((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))");

        String s2 = "aaaaabbbbbbccccddddd";
        String nonDup= StringUtility.removeDuplicates(s2);
        System.out.println(nonDup);


        System.out.println("(((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))");


        boolean password= StringUtility.isStrongPassword("Musty033...");
        System.out.println("password is strong = " + password);










    }


}
