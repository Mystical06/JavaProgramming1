package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {
        String str= "Cydeo12345School    !@#$%WoodenSpoon";

        String digits ="";//12345
        String letters= "";//CydeoWoodenSpoon
        String specialChars= "";// !@#$%

        for (int i = 0; i <str.length(); i++) {//i: index numbers of str (0 ~ last index)

            char ch=str.charAt(i); //ch: includes all characters in the str

            if (ch>= '0' && ch<='9'){// if the character is between '0' to '9' then it is digit
                digits+=ch;
            }
            else if (ch>= 'a' && ch<='z') {//if the character is between 'a' to 'z' then it is letter
                letters+=ch;
            } else if (ch>= 'A' && ch<='Z') {// if the character is between 'A' to 'Z' then it is still letter
                letters += ch;
            } else {// if the character none of above then it is special character
                if (ch!=' ')
                specialChars+=ch;
            }


        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(specialChars);






    }


}
