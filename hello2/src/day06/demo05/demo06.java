package day06.demo05;

import java.util.ArrayList;
import java.util.Random;

public class demo06 {

    public static void main(String[] args) {
        ArrayList<Integer> ListA =new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int num = r.nextInt(33)+1;
            ListA.add(num);

        }
        for (int i = 0; i < ListA.size(); i++) {
            System.out.println(ListA.get(i));

        }
    }
}
