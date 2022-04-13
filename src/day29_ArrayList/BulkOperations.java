package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7));

        System.out.println(list);

        list.removeAll(Arrays.asList(3,5,8));
        System.out.println(list);


        System.out.println("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL");

        ArrayList<Integer> number = new ArrayList<>();
        number.addAll(Arrays.asList(100,200,300,400,500,600,700,100,200,300,800,900));
        number.retainAll(Arrays.asList(100,200,300));

        System.out.println(number);

        System.out.println("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL");

        ArrayList<String > jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA", "SDET", "Developer", "QA", "SDET", "Scrum Master", "BA", "BA"));

        jobTitles.retainAll(Arrays.asList("QA", "SDET"));
        System.out.println(jobTitles);

        System.out.println("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(  Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10) );
        boolean r1 =nums.contains(10);
        boolean r2= nums.contains(2) && nums.contains(5) && nums.contains(10);
        boolean r3= nums.containsAll(Arrays.asList(2,5,10));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL");

        String[] names = {"Josh", "Jack", "Daniel", "Shay", "Breanna"};
        ArrayList<String> nameList= new ArrayList<>(Arrays.asList(names));
        System.out.println(nameList);

       /*
        ArrayList<String> nameList= new ArrayList<>();
        nameList.addAll(Arrays.asList(names));
        */

        System.out.println("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL");

        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list2);

        System.out.println("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL");

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> list1 = new ArrayList<>(convertArrayToArrayList(arr2));
        System.out.println(list1);


    }
    //converts any primitive arrays to ArrayList
    public static ArrayList<Integer> convertArrayToArrayList (int[] array){
        ArrayList<Integer> list = new ArrayList<>();
        for (int each : array) {
            list.add(each);

        }
        return list;
    }




}


