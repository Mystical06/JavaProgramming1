package day06_PrimitiveTypeCastings;
/*
1. Create a class named BirthDay and create the following variable
			 name, birthDay(int), birthMonth(String), birthYear(int)

			 use concatenation to display the birthday of the person

			 	if  name = "John"
			 		birthDay = 25
			 	    birthMonth = "April"
			 	    birthYear = 1995;

			 	output:
			 		John was born on April/25/1995.

 */
public class Birthday {
    public static void main(String[] args) {

        String name = "Mustafa";
        int birthDay = 1;
        String birthMonth = "April";
        int birthYear = 1987;
        System.out.println(name + " was born on " + birthMonth + "/" + birthDay + "/" + birthYear + "." );

        System.out.println("-----------------------------------");
        String firstText = "My favourite book is ",
                bookName = "Les Miserables";
        System.out.println(firstText + "\"" + bookName + ".\"");





    }
}
