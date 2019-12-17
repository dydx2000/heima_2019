package Day13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo01List {
    public static void main(String[] args) {
        List<String > list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        System.out.println(list);

        //在c和d之间添加一个itheima;
        list.add(3,"itheima");
        System.out.println(list);
        String removeE  = list.remove(2);
        System.out.println(removeE);
        System.out.println(list);
        list.set(3,"itBaiMa");
        list.set(4,"shenMa");
        System.out.println(list);

        //普通for 循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }

        System.out.println("====================");
        //反向for 循环
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

        //增加for 循环
        System.out.println("====================");
        for (String s : list) {
            System.out.println(s);

        }

        //while 迭代器
        System.out.println("**********************");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());

        }

        //普通while 循环
        System.out.println("----------------");
        int i=0;
        while (i<list.size()-1){
            System.out.println(list.get(i));
            i++;

        }

    }



}
