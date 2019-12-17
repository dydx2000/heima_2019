package Day14.set.CollectionsMethods.Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Demo02KeySet {
    public static void main(String[] args) {
        Map<String ,String> map = new LinkedHashMap<>();
        String v1 = map.put("李晨","范冰冰1");
        String v2 = map.put("杨过","范冰冰2");
        String v3 = map.put("郭靖","黄蓉");
        String v4 = map.put("尹志平","凤姐");

        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String key=it.next();
            System.out.println(key+"="+map.get(key));

            }
        System.out.println("======================");
        for(String key:set){
            System.out.println(key+"="+map.get(key));


        }

    }

}
