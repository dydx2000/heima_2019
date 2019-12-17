package day12.Demo01;

public class Demo03StrBuilder {
    public static void main(String[] args) {
        String str = "hello";
        StringBuilder bu =new StringBuilder(str);
        bu.append(" World");
        System.out.println(bu);
        String s = bu.toString();
        System.out.println(s);

    }


}
