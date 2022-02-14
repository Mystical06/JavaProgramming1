package day14_String;

public class StringMethods2 {
    public static void main(String[] args) {
        
        //*****replace() method*****
        // replace (oldValue, newValue)
        
        String str = "Java is fun, I love learning Java";
        
       String str2= str.replace("Java","Python");// "Python is fun, I love learning Python"

        System.out.println("str = " + str);

        System.out.println("str2 = " + str2);


        String email= "JohnSmith@yahoo.com";
        String email2 = email.replace("yahoo","gmail");//JohnSmith@gmail.com

        System.out.println("email = " + email);
        System.out.println("email2 = " + email2);

        String sentence =" Java Java Python Python C# C# C++ C++ Python Python Python Python";
       String sentence2=sentence.replace("Python", "");
       String sentence3= sentence2.replace("   "," ");

        System.out.println("sentence = " + sentence);
        System.out.println("sentence2 = " + sentence2);
        System.out.println("sentence3 = " + sentence3);

        String s = "Dog Dog Dog Dog Dog Dog";
        String s1= s.replace("Dog","Cat");
        System.out.println("s = " + s);
        System.out.println("s1 = " + s1);

        String s3= "C# is fun, C# is cool";
        System.out.println("s3 = " + s3);
        s3=s3.replace(" C#"," Java");
        System.out.println("s3 = " + s3);

        String s4= "Java";
        System.out.println("s4 = " + s4);
        s4=s4.replace("a","e");//"Jeve"
        System.out.println("s4 = " + s4);

        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        //*****replaceFirst() method*****
        // replace (oldValue, newValue)

        String result = "Java Java Java";
        System.out.println("result = " + result);
        result=result.replaceFirst("Java","Python");
        System.out.println("result = " + result);

        String result2= "C# is fun, C# is cool";
        System.out.println("result2 = " + result2);
        result2=result2.replaceFirst("C#","Java");
        System.out.println("result2 = " + result2);



        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
