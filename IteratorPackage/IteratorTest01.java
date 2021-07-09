package IteratorPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest01 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();  //创建一个数组集合
        //向集合中添加元素：
        //有序可重复，存进去和取出的顺序一样，并且可以重复
        c1.add(100);
        c1.add(200);
        c1.add(400);
        c1.add(100);
        Iterator it = c1.iterator();  //取迭代器对象
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("-------------------------------");

        Collection c2 = new HashSet();  //创建一个hashset集合
        //向集合中添加元素：
        //无序不可重复，取出的顺序和存进的顺序不一定相同
        c2.add(100);
        c2.add(200);
        c2.add(50);
        c2.add(500);
        c2.add(100);
        Iterator it2 = c2.iterator(); // 取迭代器对象
        while (it2.hasNext()){
            System.out.println(it2.next());
        }
    }
}
