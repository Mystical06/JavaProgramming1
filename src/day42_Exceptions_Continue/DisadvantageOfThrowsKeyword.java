package day42_Exceptions_Continue;

public class DisadvantageOfThrowsKeyword {

    public static void main(String[] args) throws InterruptedException{

        System.out.println("Hello");


        sleep(2.5);//throws keyword


        System.out.println("Hello World");

        System.out.println("---------------------------------------------");


        System.out.println("Hello");

        MorningWorkOut.sleep(2.5);//try & catch

        System.out.println("Hello World");

    }


        public static void sleep(double seconds) throws InterruptedException {

                Thread.sleep( (long) (seconds * 1000) );


        }



























}
