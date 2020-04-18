package day11.demo01.Demo08;

import java.util.ArrayList;
import java.util.Random;

public class NormalMode {
    public static void main(String[] args) {
        NormalMode normal = new NormalMode();
        System.out.println(normal.divide(10,4));
        normal.sayHello();

    }


    public ArrayList<Integer> divide(final int toalMoney,final int totalCount){
        ArrayList<Integer> list =new ArrayList<>();

        int avg =toalMoney / totalCount;
        int mod = totalCount % totalCount; //余数

        for (int i =0; i< totalCount;i++){
            if (i==totalCount-1){
                list.add(avg+mod);
                System.out.println(i+":"+ (avg+mod));

            }else{

            list.add(avg); //数值不正确,有时间再慢慢研究一下怎么整吧。
                System.out.println(i+":"+avg);
            }
        }


        return list;
    }

    public ArrayList<Integer> Ramdivide(int totalMone,int totalCount){
        ArrayList<Integer> list = new ArrayList<>();

        Random r = new Random();
        int money =r.nextInt(10);
//        if(){
//
//        }


        return list;

    }


    public void sayHello() {
        System.out.println("Day01");
    }
}
