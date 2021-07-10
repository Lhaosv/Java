package CollectionPackage.List.Arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class ArraylistTest01 {
    public static void main(String[] args) {
        List list1 = new ArrayList();  // 默认初始化容量为10
        List list2 = new ArrayList(20);  //创建一个Array数组，初始化容量为20
        Collection c = new HashSet();  // 创建一个hashset集合
        //向hashset集合中添加元素：
        c.add(10);
        c.add(50);
        c.add(20);
        c.add(7);

        List list3 = new ArrayList(c);  //通过这个构造方法可以将hashset集合转换成list集合
        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i));
        }
    }
}
