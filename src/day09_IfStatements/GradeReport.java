package day09_IfStatements;

public class GradeReport {
    public static void main(String[] args) {
 /*
 Task:
	1. garde report ==> A, B, C, D, F
	2. name of the month
  */
int mark = 82;
String grade;
if (mark >=90 && mark<100 ){
    grade="Excellent";
        }else if (mark >= 80 && mark<=89){
    grade="Great";
        }else if(mark>= 70&& mark<= 79){
    grade="Good";
        }else if (mark>= 60&&mark<=69){
    grade="Pass";
        }else {
    grade="Fail";
        }
        System.out.println("grade = " + grade);

        System.out.println("------------------------------------------------------------------------");
int n=8;
String month;
if (n==1){
    month="January";
}else if (n==2) {
    month = "February";
}else if (n==3){
    month="March";
}else if (n==4){
    month="April";
}else if (n==5){
    month="May";
}else if (n==6){
    month="June";
}else if (n==7){
    month="July";
}else if (n==8){
    month="August";
}else if (n==9){
    month="September";
}else if (n==10){
    month="October";
}else if (n==11){
    month="November";
}else {
    month="December";
}
        System.out.println("month = " + month);


























































    }
}
