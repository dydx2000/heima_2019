package day06.demo05;

import java.util.Scanner;

//import java.util.Scanner;
public class Demo01Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("john")    ;
        stu1.setAge(20);
        System.out.println("姓名: " + stu1.getName() +"年龄: " + stu1.getAge());
        System.out.println("===========================");

        Student stu2 = new Student("古力娜扎",21);
        stu2.setAge(22);
        System.out.println("姓名: " + stu2.getName() +"年龄: " + stu2.getAge());
        Scanner scn = new Scanner(System.in);
        System.out.print("请输入一个数字:");
        int num =scn.nextInt();
        System.out.print("输入的数字为: "+num);
        System.out.print("\r请输入一个字符串:");
        String str1 =scn.next();

        System.out.print("\r输入了字符串: "+str1);
        Scanner scan2 = new Scanner(System.in);
        int a = scan2.nextInt();
        int b = scan2.nextInt();

        System.out.println(a+b);
        int aa=1;
        int bb=2;
        int cc=3;
        int temp = a>b?a:b;
        int max = temp>cc ? temp:cc;
        System.out.println(max);
        int abc = new Scanner(System.in).nextInt();

    }
}
