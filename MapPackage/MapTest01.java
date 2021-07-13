package MapPackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
map集合中常用的方法
 */
public class MapTest01 {
    public static void main(String[] args) {
        //创建map集合对象：
        Map<Integer,String> map = new HashMap<>();

        //向map集合中添加键值对：
        map.put(1,"张三");
        map.put(2,"李四");
        map.put(3,"王五");

        //通过key获取value：
        String value = map.get(1);
        System.out.println(value);

        //获取键值对的数量：
        System.out.println("键值对的数量：" + map.size());

        //通过key删除key-value：
        map.remove(2);
        System.out.println("键值对的数量：" + map.size());

        //判断是否包含某个key：
        System.out.println(map.containsKey(2));

        //判断是否包含某个value：
        System.out.println(map.containsValue("王五"));

        //获取所有的value：
        Collection<String> values = map.values();
        for (String s1:values){  //s1表示集合values中的元素
            System.out.println(s1);
        }

        //清空map集合：
        map.clear();
        System.out.println("键值对的数量：" + map.size());

        //判断是否为空：
        System.out.println(map.isEmpty());


    }
}
