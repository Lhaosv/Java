package CollectionPackage.collections;

import java.util.*;
/*
Collections集合工具类。
 */

public class CollectionsTest01 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        //Arraylist是非线程安全的，变成线程安全的：
        Collections.synchronizedList(list1);
        list1.add("a");
        list1.add("c");
        list1.add("x");
        list1.add("f");
        //排序：
        Collections.sort(list1);
        for (String l1 : list1){
            System.out.println(l1);
        }
        Set<Cat> cats = new HashSet<>();
        cats.add(new Cat(5));
        cats.add(new Cat(7));
        cats.add(new Cat(2));
        //set集合不能直接调Collections.sort（）方法
        //把set集合转换成list集合：
        List<Cat> mylist = new ArrayList<>(cats);
        //再对list集合进行排序：
        Collections.sort(mylist);
        for (Cat cat : mylist){
            System.out.println(cat);
        }

    }
}
class Cat implements Comparable<Cat>{
    int age;

    public Cat() {
    }

    public Cat(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Cat o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "小猫[" +
                "age=" + age +
                ']';
    }
}
