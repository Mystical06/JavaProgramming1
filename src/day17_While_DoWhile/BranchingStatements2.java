package day17_While_DoWhile;

public class BranchingStatements2 {
    public static void main(String[] args) {

        for (char i = 'A'; i <='E'; i++) {

            if (i=='C'){
              continue;
            }
            System.out.println(i);
        }
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        //print all even numbers from 1~10

        for (int i = 1; i <= 10; i++) {

            if (i%2==0){
                System.out.print(i+" ");
                continue;



            }

        }

        System.out.println();
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        //print all odd numbers from 1~10

        for (int i = 0; i <= 10; i++) {

            if (i % 2 == 0) {

                continue;
            }
            System.out.print(i+" ");


        }
    }
}
