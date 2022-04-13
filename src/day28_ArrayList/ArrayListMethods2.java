package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);
       /*
        int num =1;// shows the index
        list.remove(num);
        System.out.println(list);
        */

        Integer num= 200;
        list.remove(num);
        System.out.println(list);

        //clear(): removes all the elements in the ArrayList
        list.clear();
        System.out.println(list);

        System.out.println("*********************************************************************************");

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a =  characters.indexOf('A'); //0
        int b = characters.lastIndexOf('A'); //4


        System.out.println(a);
        System.out.println(b);

        System.out.println("--------------------------------------------");

        boolean r2 =  characters.contains('A');

        boolean r3 = characters.contains('Z');

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("--------------------------------");

























    }
}
