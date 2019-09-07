package day12.Demo01;

import java.util.Arrays;

public class demo01system {
    public static void main(String[] args) {
//        demo01();
        int[] src = new int[]{1,2,3,4,5,6};
        int[] dst = new int[]{4,5,6,7,8,9};
        System.arraycopy(src,0,dst,0,3);
        System.out.println(Arrays.toString(dst));
        System.out.println(System.currentTimeMillis());
    }

    private static void demo01() {
        long s =System.currentTimeMillis();
        for (int i = 1; i <=9999 ; i++) {
            System.out.println(i);

        }
        long e =System.currentTimeMillis();
        System.out.println("程序共运行了： "+(e-s)+"亳秒");



    }
}
