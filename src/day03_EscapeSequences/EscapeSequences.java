package day03_EscapeSequences;
/*
\n: MUST be given with double quote
\n: starts new line
\t: paragraph space (just like hitting the TAB button on keyboard)
\\: prints one backslash (\)
\": double quote
 */
public class EscapeSequences {


    public static void main(String[] args) {
        System.out.println("Java \nPython \nC#");
        System.out.println("----------------------------------------");
        System.out.println("Hello Cydeo! \nHow are you all today? \nIt's nice to see you all! \nWhat class do we have next week?");

        System.out.println("----------------------------------------");
        System.out.println("\tJava is a cool programming language.");
        System.out.println("----------------------------------------");
        System.out.println("https:\\\\"); /*in order to print double backward slash
                                            we need to type 4 backwards slash!!!*/
        System.out.println("----------------------------------------");
        System.out.println("\"Hello World\"");//to print double quote, type \" !!!
        System.out.println("My favourite TV show is \"Game of Thrones\"");

    }
}
