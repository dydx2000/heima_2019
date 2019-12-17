package Day14.set;

public class Demo02hashCode {
    public static void main(String[] args) {
        Person p1 = new Person();
        int h1 = p1.hashCode();
        System.out.println(h1);
        System.out.println(p1);
        System.out.println("=============");
        Person p2 = new Person();
        int h2 =p2.hashCode();
        System.out.println(h2);
        System.out.println(p2);
    }
}
