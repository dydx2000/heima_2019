package day06.demo05;

import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        list.add("da da");
        System.out.println(list);
        list.add("古力娜扎");
        System.out.println(list);
        ArrayList<Integer> listA =new ArrayList<>();
        listA.add(190);
        listA.add(210);
        listA.add(310);
        listA.add(190);
        System.out.println(listA);
        int b =listA.get(2);
        System.out.println("b= " + b);
        System.out.println(listA.size());


    }
}
