package MapPackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
map集合的另一种遍历方法
Set<Map.Entry<K,v>> entrySey()
以上这个方法直接把map集合转换成set集合
set集合的类型是Map.Entry
 */
public class MapTest03 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"zhangsan");
        map.put(2,"lisi");
        map.put(3,"wangwu");
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        //遍历集合set，每一次取出一个Node：
        Iterator<Map.Entry<Integer,String>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<Integer,String> node = it.next();
            int key = node.getKey();
            String value = node.getValue();
            System.out.println(key + " = " + value);
        }

        System.out.println("======================");
        //使用增强for循环：
        for (Map.Entry<Integer,String> node:set){
            System.out.println(node.getKey() + " = " + node.getValue());
        }


    }
}
