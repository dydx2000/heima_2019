package day12.Demo01;

import java.util.Date;

public class Demo01Date {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        long haomiao =System.currentTimeMillis();
        int day = (int)haomiao /864000000;
//        System.out.println(day);
        
        demo01();

        demo02();
    }

    private static void demo02() {
        Date date2 = new Date(1559915156228L);
        System.out.println("date2: "+date2);
        Date date3 = new Date(8L);
        System.out.println("date3: "+date3);
        Date date4 = new Date();
        long timemilli =date4.getTime();
        System.out.println(timemilli);

        System.out.println(System.currentTimeMillis());
        System.out.println(new Date(timemilli));

    }

    /*
    Date 类的空参数构造方法
     */
    private static void demo01() {
        Date date =new Date();
        System.out.println("date1: "+date);
    }
}
