package Day14.set.CollectionsMethods.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Demo01Map {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("name","goulun");
        hashMap.put("age",18);
        hashMap.put("gender","Male");
        System.out.println(hashMap);

        Map<String ,String> map = new LinkedHashMap<>();
        String v1 = map.put("李晨","范冰冰1");
        String v2 = map.put("杨过","范冰冰2");
        String v3 = map.put("郭靖","黄蓉");
        String v4 = map.put("尹志平","凤姐");
        System.out.println("v1: "+v1);
        System.out.println("v2: "+v2);
        System.out.println(map);
    }

}
