package day16_ForLoopStringPractice;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str= "aaabccc";
        String result= "";


        for (int i=0; i<= str.length()-1; i++){// i: index numbers of the string starting from 0
            char ch= str.charAt(i);

            //           0  ==                 3 ====> False
            if (str.indexOf(ch) ==str.lastIndexOf(ch)){// if the first and last index numbers of character are the same,
                //then the charter is unique!!!!
                result+=ch;
        }




        }
        System.out.println("result = " + result);



    }
}
/*
3. Write a program that can return the unique characters from a String

			Ex:
				input:
					AABCCD

				output:
					BD

			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique

				  indexOf('A') ==> 0
				  lastIndexOf('A') ==> 1

				  indexOf('B') ==>2
				  lastIndexOf('B') ==> 2
 */