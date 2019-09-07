package Day14.set;

import java.util.HashSet;

public class Demo03HshSetSavePerson {
    public static void main(String[] args) {
        HashSet<Person> set =new HashSet<>();
        Person p1 =new Person("小美女",18);
        Person p2 =new Person("小美女",18);
        Person p3 =new Person("小美女",19);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));
        System.out.println(set);


    }
}
