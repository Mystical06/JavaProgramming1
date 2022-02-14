package day08_IfStatements;

public class GradeReport {
    public static void main(String[] args) {
 /*
        System.out.println( true == !false ); // true
        System.out.println( !true != false ); // false
        System.out.println( !false == true); // true
        System.out.println(!!false); //false
        System.out.println(!!!true); // false
         */

int score =85;
/*
boolean excellent = score >= 90 && score <= 100,

        great = score >= 80 && score <= 89,
        good = score >= 70 && score <= 79,
        passed = score >= 60 && score <= 69,
        failed = score >= 0 && score <= 59;
*/
boolean excellent = score >= 90 && score <= 100,
        great = !excellent,
        good = !excellent && !great,
        passed = !excellent && !great && !good,
        failed = !excellent && !great && !good && !passed;
if (excellent){
    System.out.println("Excellent");

}
if (great) {
    System.out.println("Great");

}
if (good) {
    System.out.println("Good");
}

if (passed){
    System.out.println("Passed");
}
if (failed){
    System.out.println("Failed");
}

/*
score:
    90 ~ 100 ==> Excellent
    80 ~ 89 ==> Great
    70 ~ 79 ==> Good
    60 ~ 69 ==> Passed
    0 ~ 59 ==> Failed
 */





































































    }
}
