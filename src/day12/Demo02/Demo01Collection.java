package day12.Demo02;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01Collection   {
    public static void main(String[] args) {
        Collection<String> col1 = new ArrayList<>();
        System.out.println(col1);
        boolean b1= col1.add("张三");
        System.out.println(b1);
//        System.out.println(col1);
        ((ArrayList<String>) col1).add("李四")    ;
        col1.add("王五");
        col1.add("赵六");
        col1.add("田七");
        System.out.println(col1);
        col1.remove("王五");
        System.out.println(col1);
        col1.remove("王八");
        System.out.println(col1);
        boolean b2 = col1.contains("张四");
        System.out.println(b2);
        System.out.println(col1.isEmpty());
        System.out.println(col1.size());
        Object[]  arr = col1.toArray();
        for (int i = 0; i < col1.size(); i++) {
            System.out.println(arr[i]);
        }
        col1.clear();
        System.out.println(col1);

    }
}
