package day12.Demo03;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo05 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Hello");
        list2.add("World!");
        printArray(list1)  ;
        printArray(list2);





    }

    public static void printArray(ArrayList<?> list){

        Iterator<?> it = list.iterator();
        while (it.hasNext()){
            Object next = it.next();
            System.out.println(next);
        }
        System.out.println(list);

    }

}
