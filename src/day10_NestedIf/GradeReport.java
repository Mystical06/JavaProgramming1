package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
   /*
        90 ~ 100: Excellent
        80 ~ 89: Great
        70 ~ 79: Good
        60 ~ 69: Passed
        0 ~ 59: Failed
         */


int score = 101;
String grade =""; //temporary
if (score>=0 && score<=100){

    if (score>= 90){
        grade= "Excellent";
    }
    else if(score>= 80){
        grade="Great";
    }
    else if(score >= 70){
        grade= "Good";
    }
    else if(score >= 60){
        grade= "Pass";
    }
    else {
        grade="Fail";
    }

    System.out.println(grade);
} else {
    System.out.println("!!!Invalid score!!! Please enter a valid score between 0-100!");
}








































































































    }
}
