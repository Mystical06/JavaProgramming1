package day28_ArrayList;

public class StrongPassword2 {
    public static void main(String[] args) {
        boolean pass = isStrongPassword("Musty033...");
        System.out.println("Password is strong: "+ pass);
    }


   public static boolean isStrongPassword (String password){

       int countUppercase = 0;
       int countLowerCase = 0;
       int countDigits = 0;
       int countSpecialChar = 0;

       for (int i = 0; i < password.length(); i++) {
           char each= password.charAt(i);

           if (Character.isUpperCase(each)){
               countUppercase++;
           } else if (Character.isLowerCase(each)) {
               countLowerCase++;
           } else if (Character.isDigit(each)) {
               countDigits++;
           }else {
               countSpecialChar++;
           }
       }
       boolean strongPassword = password.length()>=8 && !password.contains(" ") && countUppercase>0
               && countLowerCase>0 && countDigits>0 && countSpecialChar>0;
       return strongPassword;
   }

       /* System.out.println("countUppercase = " + countUppercase);
        System.out.println("countLowerCase = " + countLowerCase);
        System.out.println("countDigits = " + countDigits);
        System.out.println("countSpecialChar = " + countSpecialChar);
        */


}
