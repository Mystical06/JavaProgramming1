package day19_LoopPractices;

public class DuplicatedCharacter {
    public static void main(String[] args) {
        String  str = "aaaaabbcdeef";
        String result="";


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;


            for (int j = 0; j < str.length(); j++) {
                char eachChar = str.charAt(j);

                if (ch == eachChar) {//if given char is matching with the eachChar, then ch is appeared in the string.
                    count++;
                }


            }
            if (count==2) {
                result+=ch;
                System.out.println("The first duplicated character is: "+ result);
                break;
            }

        }





    }
}
//1. Write a program that can return the first duplicated character from a string