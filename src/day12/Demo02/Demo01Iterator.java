package day12.Demo02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo01Iterator {
    public static void main(String[] args) {
//        Collection<String> col1 = new ArrayList<>();
//        col1.add("姚明");
//        col1.add("科比");
//        col1.add("麦迪");
//        col1.add("詹姆斯");
//        col1.add("艾弗森");
//        show01();
        show02();
        }

    private static void show02() {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("abcde");
        list1.add("2");
        Iterator<String> it = list1.iterator();
        while (it.hasNext()){
            String  s = it.next();
            System.out.println(s.length());
        }
    }

    private static void show01() {
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(1);
        //迭代器遍历list集合
        //获取迭代器
        Iterator it = list.iterator();
        //使用迭代器中的方法hasnext
        while (it.hasNext()){
            //取出元素也是object类型
            Object obj = it.next();
            System.out.println(obj);
            //使用String类特有的方法，length获取字符串的长度；不能使用， 多态
            //
            String  s=(String)obj;
            System.out.println(s.length());
    }



/*

        Iterator<String> it =col1.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("==============" );



//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        boolean b = it.hasNext();
//        System.out.println(b);
//        System.out.println(it.next());



    }


    public class ArrayList<Int>{

    }
    */
     }
}
