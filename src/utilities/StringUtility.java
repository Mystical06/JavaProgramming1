package utilities;

import java.util.Arrays;

public class StringUtility {


    //prints each character of the given string
    public static void printEachChar(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    //reverse the given string and returns the reversed string
    public static String reverse(String str){//"Java"
        String result = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }
        return result;//"avaJ"
    }

    //checks if the given string is palindrome or not, returns boolean
    public static boolean isPalindrome(String str){
        return reverse(str).equalsIgnoreCase(str);
    }

    //checks if the given string is palindrome or not, returns boolean
    public static boolean anagram(String str1, String str2){//"abc" , "bca"

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str1.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);

    }


    //removes the duplicates from given string, returns String "aaaabbbbbccc" ===> "abc"
    public static String removeDuplicates( String str){
        String result= "";
        for (int i = 0; i < str.length(); i++) {
            char each= str.charAt(i);

            if(!result.contains(""+each)){
                result +=each;
            }

        }
        return result;
    }

    //checks if a given password is strong or not
    public static boolean isStrongPassword(String password){
        boolean r1 =password.length()>=8 && !password.contains(" ");
        boolean r2= false;// has upper case
        boolean r3= false;// has lower case
        boolean r4= false;// has special character
        boolean r5= false;// has digit
        for (char each : password.toCharArray()) {
            if (Character.isUpperCase(each)){
                r2=true;
            }else if (Character.isLowerCase(each)){
                r3=true;
            }else if (Character.isDigit(each)){
                r5=true;
            }else {//special char
                r4=true;
            }
        }
        boolean isStrongPassword= r1 && r2 && r3 && r4 && r5;
        return isStrongPassword;
    }




















}
