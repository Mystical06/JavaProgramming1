package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {


        // add(data) method: adds the data after the last index of the Arraylist
        // add(index, data) method2: inserts the data at the specified index of the ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);//0
        numbers.add(20);//1
        numbers.add(30);//2
        numbers.add(40);//3
        numbers.add(40);//4
        numbers.add(50);//5
        numbers.add(60);//6

        numbers.add(2,25);
        numbers.add(numbers.indexOf(50),45 );
        System.out.println(numbers);


        //size(): gives how many elements we have in the ArrayList
        System.out.println(numbers.size());

        //last index: gives the last index of the arrayList
        System.out.println(numbers.size()-1);

        //get(index): returns the element at the specific given index of Arraylist
        System.out.println(numbers.get(3));//30

        System.out.println("-----------------------------------------------------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + ",");

        }
        System.out.println();
            System.out.println("======================================================================");

            //set(index, new element): replaces the element at the given index with the new element.
            ArrayList<String> list = new ArrayList<>();
            list.add("Java");
            list.add("Python");
            list.add("Java");
            list.add("C#");
            list.add("Ruby");

            list.set(2,"JavaScript" );
            list.set(3,"C++");


            System.out.println(list);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        //remove(index): removes the element at the given index
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);

        employees.remove(1);
        System.out.println(employees);

        employees.remove(employees.size()-1);//removes the element at the last index of ArrayList
        System.out.println(employees);

       boolean r1= employees.remove("Hulya");
        System.out.println(employees);

        boolean r2 = employees.remove("Neira");
        System.out.println(employees);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);


















        }


    }

