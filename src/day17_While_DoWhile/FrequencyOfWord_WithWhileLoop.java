package day17_While_DoWhile;

import java.util.Locale;

public class FrequencyOfWord_WithWhileLoop {
    public static void main(String[] args) {

        String str = "Java Java Java Python";
        int frequency=0;

        while (str.toUpperCase().contains("JAVA")){
            str= str.replaceFirst("Java","");
            frequency++;
        }


        System.out.println("frequency = " + frequency);

        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");

        String sentence = "cat cat dog dog";
        //" cat dog dog"
        //" dog dog"
        sentence = sentence.toLowerCase();

        int countCat = 0; // 2

        while(sentence.contains("cat")){
            sentence = sentence.replaceFirst("cat", "");
            countCat++;
        }

        System.out.println(countCat);

        System.out.println("¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦¦");

        String s = "java is much easier to learn while python is more complicated and java is richer than python";

        int countJava =0;
        int countPython = 0;
        int countIs=0;

        while(s.contains("java") || s.contains("python") || s.contains("is")){

            if(s.contains("java")){
                s = s.replaceFirst("java", "");
                countJava++;
            }

            if(s.contains("python")){
                s = s.replaceFirst("python", "");
                countPython++;
            }
            if(s.contains("than")) {
                s = s.replaceFirst("is", "");
                countIs++;
            }
        }

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);
            System.out.println("countThan = " + countIs);






    }
}
/*
2. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "JavaJavaJava";

            output: 3

           	Str = "JavaJava";

           		substrings:
           			1. Java  //substring(0, 4)
           			2. avaJ  //substring(1, 5)
           			3. vaJa  // substring(2, 2+4 )
           			4. aJav  // substring(3, 3+4)
           			5. Java  // substring(4, 4+4)

        	Str = "Java Java Java Python"

        		Delete 1st Java:
        				" Java Java Python"

				Delete 2d Java:
						" Java Python"

				Delete 3rd Java:
						"  Python"
 */