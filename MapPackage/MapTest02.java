package MapPackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
map集合遍历的一种方式
 */
public class MapTest02 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"zhangsan");
        map.put(2,"lisi");
        map.put(3,"wangwu");
        //获取所有的key，所有的key是一个set集合：
        Set<Integer> keys = map.keySet();

        //通过增强for循环遍历：
        for (int key:keys){
            System.out.println(key + "=" + map.get(key));
        }

        System.out.println("==========================");
        //通过迭代器遍历：
        Iterator<Integer> it = keys.iterator();
        while (it.hasNext()){
            int key = it.next();
            String values = map.get(key);
            System.out.println(key + "=" + values);
        }
    }
}
