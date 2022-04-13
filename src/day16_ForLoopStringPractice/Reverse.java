package day16_ForLoopStringPractice;

public class Reverse {
    public static void main(String[] args) {

        String str ="Wooden Spoon";
        //index:     012345....
        String result="";// to contain reversed version of str
        // noopS nedooW

       // result+= str.charAt(str.length()-1);

        for (int i = str.length()-1; i >= 0; i--) {//i: index numbers of str (starting last index to index 0)
          result+= str.charAt(i);//adding each character to result
        }
        System.out.print(result);

    }
}
/*
1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
 */