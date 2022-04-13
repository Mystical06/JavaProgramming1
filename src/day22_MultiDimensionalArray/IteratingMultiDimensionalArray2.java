package day22_MultiDimensionalArray;

public class IteratingMultiDimensionalArray2 {
    public static void main(String[] args) {

        int[][] arr2D = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };

        for (int i = arr2D.length - 1; i >= 0; i--) {// i= index number of one-dimensional arrays starting from last index to 0

            for (int j = 0; j < arr2D[i].length; j++) {//j= index number of elements starting from 0 to last index
                System.out.print(arr2D[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        for (int k = 0; k < arr2D.length; k++) {
            for (int l = arr2D[k].length - 1; l >= 0; l--) {
                System.out.print(arr2D[k][l] +" ");
            }
            System.out.println();
        }


        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int i1 = arr2D[i].length - 1; i1 >= 0; i1--) {
                System.out.print(arr2D[i][i1]+ " ");
            }
            System.out.println();
        }


    }
}
/*
task1:
                9 10 11 12 13
                4 5 6 7 8
                1 2 3
task2:
                3 2 1
                8 7 6 5 4
                13 12 11 10 9
 task3:
                13 12 11 10 9
                8 7 6 5 4
                3 2 1
 */