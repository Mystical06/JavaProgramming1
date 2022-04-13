package day17_While_DoWhile;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str= "AABBCC";

        String result="";
        for (int i = 0; i <str.length() ; i++) {
            String ch =""+ str.charAt(i); // "A", "A", "B", "B", "C", "C"
           if(result.contains(ch)){// if the result already contains the character
               //break; ==>> exit (exits the if statement
               continue;// skip
           }
            result+=ch;
        }

        System.out.print(result);



    }
}
