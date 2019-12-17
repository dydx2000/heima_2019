package day02;

import java.util.concurrent.atomic.AtomicBoolean;

public class primeNum {
    public static void main(String[] args) {
        System.out.println("0-100以内的素数为: ");

        for (int i = 0; i <= 100; i++) {
            boolean flag = true;

            if (i == 0 || i == 1) {
                System.out.print("");

            } else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.print(i + " ");
                }

            }

        }
    }
}
