package day11.demo01.Demo07;

import java.util.ArrayList;
import java.util.List;

public class DemoInterface {
    public static void main(String[] args) {
//        ArrayList<String> list = ArrayList<>();
        List<String> list = new ArrayList<>();
        List<String> result = addNames(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));

        }
        for (int i = 0; i < list  .size(); i++) {
            System.out.println(list.get(i));

        }

    }

    public  static List<String> addNames(List<String> list){
        list.add("sdsfd");
        list.add("gulinazha");
        list.add("dadaf");
        list.add("dayanalr");
        return list;

    }
}
