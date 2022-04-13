package day19_LoopPractices;

public class UniqCharacters {
    public static void main(String[] args) {
       String  str = "aabccdeef";
       String result="";//represents the frequency of the ch

        for (int j = 0; j < str.length(); j++) {
            char ch=str.charAt(j);
            int count=0;
            for (int i = 0; i < str.length(); i++) {//compares the character that outer loop picked with each character of the string
                char each=str.charAt(i);
                if (ch==each){
                    count++;
                }

                }


            if (count>1)//if the frequency is more than 1, then the character is not unique
                continue;
                result+=ch;
        }

        System.out.println(result);


    }

}
/*
2. Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf


 */