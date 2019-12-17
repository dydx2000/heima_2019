package Day14.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Demo04LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("itcast");
        System.out.println(set);
        System.out.println("=========================");

        LinkedHashSet<String> linkedHashSet =new LinkedHashSet<>();
        linkedHashSet.add("abc");
        linkedHashSet.add("www");
        linkedHashSet.add("abc");
        linkedHashSet.add("itcast");
        System.out.println(linkedHashSet);

    }
}
