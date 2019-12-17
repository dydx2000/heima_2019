package day06.DemoString;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
//        String str1 = new String();
//        System.out.println("str1:"+ str1);
//        char[]  charArray = new char[]{'a','b','c'};
//        String str2 =new String(charArray);
//        System.out.println("str2: "+str2);
//        byte[]  byteArray = {97,98,99};
//        String str3= new String(byteArray);
//        System.out.println("str3: "+str3);
//        String str4 ="Hello World";
//        System.out.println(str4);
        int length ="sfsdfafadfwiadkdedashazheidsi".length();
        System.out.println("字符串长度为: " + length);
        System.out.println("==========================");
        char ch =   "Hello".charAt(1);
        System.out.println(ch);
        byte[] bytes = "Hello".getBytes();
        System.out.println(bytes);
        System.out.println("==================");
        String str1 ="aaa bbb ccc ddd";
        String[] arrstr1 = str1.split(" ");
        for (int i = 0; i < arrstr1.length; i++) {
            System.out.print(arrstr1[i]+", ");

        }
        Scanner sx = new Scanner(System.in);
        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;
        String strx = sx.next();
        char[] chars =strx.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char chx =chars[i];
            if ('A'<=chx && chx <='Z'){
                countUpper += 1;

            }else if('a'<=chx && chx <='z'){
                countLower++;
            }else if('0'<=chx && chx <='9'){
                countNumber++;
            }else{
                countOther++;
            }

        }
        System.out.println(countLower);
        System.out.println(countNumber);
        System.out.println(countOther);
        System.out.println(countUpper);
    }

}
