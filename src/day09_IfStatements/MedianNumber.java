package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
        /*
        2. Create a class called MedianNumber. write a program that can find the median number between
        three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number

			Possibility #1: a could be median number
			Possibility #2: b could be median number
			Possibility #3: c could be median number
         */
        int a = 10, b = 15, c = 20;
        boolean aMedianNumber = (a > b && a < c) || (a>c && a<b);
        boolean bMedianNumber = ( b< c && b>a) || (b>c && b < a);
        boolean cMedianNumber = (c> b && c<a) || (c<b && c>a); // boolean cMedianNumber = !aMedianNumber && !bMedianNumber

        if (aMedianNumber) {
            System.out.println(a + " is the median number");
        }
if ( bMedianNumber){
    System.out.println(b + " is the median number");
}
if (cMedianNumber) {
    System.out.println(c+ " is the median number");

}





    }
}
