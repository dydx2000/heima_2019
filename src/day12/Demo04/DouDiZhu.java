package day12.Demo04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DouDiZhu {
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();
        String[] colors = {"b_", "h_", "m_", "f_"};
        String[] numbers = {"2", "A", "K", "Q","J","10","9","8","7","6","5", "4", "3"};
        poker.add("大王");
        poker.add("小王");
        for (String number : numbers) {
            for (String color : colors) {
//                System.out.println(color + number);
                poker.add(color+number);
            }

        }
        System.out.println(poker);
        Collections.shuffle(poker);
        System.out.println(poker);

        //定义4个集合,存储玩家的牌和底牌
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String>  dipai= new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i);
            if(i>=51){
                dipai.add(p);

            }else if(i%3 ==0){
                player01.add(p);
            }else if (i%3 ==1){
                player02.add(p);
            }else if (i%3 == 2){
                player03.add(p);
            }
        }
        System.out.println("玩家1的牌: "+player01);
        System.out.println("玩家2的牌: "+player02);
        System.out.println("玩家3的牌: "+player03);
        System.out.println("底牌: "+dipai);

    }
}
