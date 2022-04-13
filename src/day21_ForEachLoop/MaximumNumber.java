package day21_ForEachLoop;

public class MaximumNumber {
    public static void main(String[] args) {

        int [] numbers={10,5,4,20,1,0};
        int max=numbers[0];

        for (int each:numbers){
            if (each>max){
                max=each;
            }
        }
        System.out.println(max);
       /* for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >max){//if there is an element in the array that is greater than the current max number
                max=numbers[i]; //assigning greater number to variable max
            }
        }

        System.out.println(max);

        */

    }
}
