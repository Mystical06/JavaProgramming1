package day14_String;

public class StringMethods3_Substring {
    public static void main(String[] args) {

        //*******substring() method*********
        //substring(beginning index, ending index)

        String word = "Cydeo School";
        String brand = word.substring(0, 4 + 1);
        System.out.println("brand = " + brand);

        String str1 = word.substring(6);
        System.out.println("str1 = " + str1);

        int word2=word.indexOf("C");
        int word3=word.indexOf("o");

        String str2= word.substring(word2,word3+1);
        System.out.println("str2 = " + str2);

        String word4= "Java Programming Language";
        String s1= word4.substring(0, word4.indexOf(" ")); //"Java"
        System.out.println("s1 = " + s1);

        String s2 = word4.substring(word4.indexOf(" ")+1,word4.lastIndexOf(" "));//"Programming"
        System.out.println("s2 = " + s2);

        String s3= word4.substring(word4.lastIndexOf(" ")+1);//"Language"
        System.out.println("s3 = " + s3);






    }
}
