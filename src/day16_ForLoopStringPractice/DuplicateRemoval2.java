package day16_ForLoopStringPractice;

public class DuplicateRemoval2 {
    public static void main(String[] args) {
        String name= "mmmuuuussssttttaaaaffffaaa Ayyyddddiiiiinnnnn";
        String result= "";

        for (int i = 0; i<= name.length()-1; i++){
            String ch= ""+ name.charAt(i);


            if (!result.contains(ch)){
                result+=ch;
            }
        }
        System.out.println("result = " + result);

    }
}
