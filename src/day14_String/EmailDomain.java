package day14_String;

public class EmailDomain {
    public static void main(String[] args) {

        String email ="Cydeo.School@gmail.com";
        String domain=email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println(domain);

        String change=domain.replace(domain, "yahoo");
        System.out.println(domain);
       email=email.replace(domain,"yahoo");
        System.out.println(email);

        String firstWord= email.substring(0,email.indexOf("."));
        System.out.println("firstWord = " + firstWord);
        String secondWord= email.substring(email.indexOf(".")+1, email.indexOf("@"));
        System.out.println("secondWord = " + secondWord);

        String newWord=email.replaceFirst(secondWord,secondWord);
        System.out.println("email = " + newWord);














     /*
     1. Write a program that can gte the domain of the email. ( Assume that a valid email is given)

		Ex:
			email = Cydeo.School@gmail.com

		output:
			gmail


			email = "School.Cydeo@yahoo.com

		output:
			yahoo
      */









    }
}
