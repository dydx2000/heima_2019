package Day14.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo01Set {
    /*
    set 无序集合,不可重复
    不能使用普通for 循环遍历
    hashset
    是一个无序集合,存储元素和取出元素的顺序有可能不一致;
     */

    public static void main(String[] args) {
        Set<Integer> set = new HashSet< >();
        set.add(6);
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);
        set.add(4);

        //使用迭代器遍历set集合
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            Integer next = it.next();
            System.out.println(next);
        }
        System.out.println("=============");
        for (Integer i : set) {
            System.out.println(i);

        }

    }
}
