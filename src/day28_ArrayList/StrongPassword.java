package day28_ArrayList;

public class StrongPassword {
    public static void main(String[] args) {

        String password= "Mystical033.";

        boolean r1 =password.length()>=8 && !password.contains(" ");
        boolean r2= false;// has upper case
        boolean r3= false;// has lower case
        boolean r4= false;// has special character
        boolean r5= false;// has digit
        for (char each : password.toCharArray()) {
            if (Character.isUpperCase(each)){
                r2=true;
            }else if (Character.isLowerCase(each)){
                r3=true;
            }else if (Character.isDigit(each)){
                r5=true;
            }else {//special char
                r4=true;
            }
        }



        boolean isStrongPassword= r1 && r2 && r3 && r4 && r5;

        System.out.println("isStrongPassword = " + isStrongPassword);


    }


    public static boolean isStrongPassword(String password){
        boolean r1 =password.length()>=8 && !password.contains(" ");
        boolean r2= false;// has upper case
        boolean r3= false;// has lower case
        boolean r4= false;// has special character
        boolean r5= false;// has digit
        for (char each : password.toCharArray()) {
            if (Character.isUpperCase(each)){
                r2=true;
            }else if (Character.isLowerCase(each)){
                r3=true;
            }else if (Character.isDigit(each)){
                r5=true;
            }else {//special char
                r4=true;
            }
        }
        boolean isStrongPassword= r1 && r2 && r3 && r4 && r5;
        return isStrongPassword;
    }
}
/*
PasswordValidation:
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit
 */