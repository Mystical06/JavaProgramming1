package day19_LoopPractices;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String str = "aabcccd";


        String result= "";


        for (int j = 0; j < str.length(); j++) {//each character from the string
            char ch= str.charAt(j);
            int count=0;

            for (int i = 0; i < str.length(); i++) {
                char each= str.charAt(i);//to find frequency of each character
                if (ch==each){
                    count++;
                }
            }
            if (result.contains(""+ ch))
                continue;
            result+=ch;
            result+=count;
        }
        System.out.println(result);












    }

}
/*
1. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1

 */