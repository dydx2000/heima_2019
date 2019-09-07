package Day13;
import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {
    public static void main(String[] args) {
//        show01();
//        show02();
        show03();
    }

    private static void show03() {
        LinkedList<String> linked01 = new LinkedList<>();
        linked01.add("a");
        linked01.add("b");
        linked01.add("c");
        linked01.add("d");
        linked01.add("e");
        String first = linked01.removeFirst();
        System.out.println("被删除的第一个元素: "+first);
        String last = linked01.removeLast();

        System.out.println("被删除的最后一个元素: "+last);
        System.out.println(linked01);

    }

    private static void show02() {
        LinkedList<String> linked01 = new LinkedList<>();
        linked01.add("a");
        linked01.add("b");
        linked01.add("c");

//        String first = linked01.getFirst();
//        System.out.println(first);
//        String last = linked01.getLast();
//        System.out.println(last);

//        linked01.clear();
        if(!linked01.isEmpty()){
            String first = linked01.getFirst();
            System.out.println(first);
            String last = linked01.getLast();
            System.out.println(last);

        }


//        String first = linked01.getFirst();
//        System.out.println(first);
//        String last = linked01.getLast();
//        System.out.println(last);

        System.out.println(linked01);



    }

    private static void show01() {
        //创建linkedlit
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);
        System.out.println("==================");

        //addFirst
        linked.addFirst("1");
        linked.push("2");
        System.out.println(linked);

        System.out.println("=====================");
        //removeFirst
        linked.removeFirst();
//        System.out.println(linked);
        linked.pop();
        linked.addLast(".com");
        linked.push("wwww");
        System.out.println(linked);


    }
}
