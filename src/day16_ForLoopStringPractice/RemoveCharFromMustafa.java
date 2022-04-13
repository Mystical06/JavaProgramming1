package day16_ForLoopStringPractice;

public class RemoveCharFromMustafa {
    public static void main(String[] args) {
        String name ="Mustafa Aydin";
        String result="";

        for(int i= 0; i<= name.length()-1; i++){
            String ch=""+ name.charAt(i);
            if (!result.contains(ch))
            result+=ch;

        }
        System.out.print(result);
    }
}
/*
2. Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					Your name

				Output:
					ABC

			Hint: You can add each characters of the string into another String
				  Condition: the character is not contained in the other String yet before you are adding
 */