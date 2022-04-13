package day16_ForLoopStringPractice;

public class Palindrome {
    public static void main(String[] args) {
        String word="Racecar";
        String reversed ="";

        for (int i = word.length()-1; i >=0; i--) {
            reversed += word.charAt(i);
        }
        System.out.print(reversed);
        System.out.println();
        boolean isPalindrome = word.equalsIgnoreCase(reversed);
        System.out.println("isPalindrome = " + isPalindrome);






    }
}
/*
"Java"==> "avaJ" ===> False (not palindrome)
"Anna"==> "annA" ===> true
level
Racecar
Dad
Mum
.
.
.
 */