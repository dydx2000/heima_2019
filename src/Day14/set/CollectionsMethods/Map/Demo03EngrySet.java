package Day14.set.CollectionsMethods.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo03EngrySet {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);

        Set<Map.Entry<String,Integer>> set = map.entrySet();

        Iterator<Map.Entry<String ,Integer>> it = set.iterator();
        while (it.hasNext()){
           Map.Entry<String ,Integer> ent =it.next();
            System.out.println(ent.getKey()+ent.getValue());
        }


    }
}
