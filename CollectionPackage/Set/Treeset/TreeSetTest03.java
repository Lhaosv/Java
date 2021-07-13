package CollectionPackage.Set.Treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
Treeset集合中元素可排序的第二种方式：使用比较器的方式
放到Treeset或者Treemap集合中key部分的元素想要排序，包括两种方式：
    第一种：放在集合中的元素实现comparable接口
    第二种：在构造Treeset或者Treemap集合的时候给他传一个比较器
comparable和comparator怎么选择：
    当比较规则不会发生改变的时候，或者说当比较规则只有一个的时候，建议使用comparable接口
    如果比较规则有多个，并且需要多个比较规则之间频繁切换，建议使用comparator接口
 */
public class TreeSetTest03 {
    public static void main(String[] args) {
        Dog d1 = new Dog(5);
        Dog d2 = new Dog(3);
        Dog d3 = new Dog(7);
        Set<Dog> dogs = new TreeSet<>(new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.age - o2.age;
            }
        }); // 在创建集合的时候传一个比较器，并重写比较规则（采用了匿名内部类方式）
        dogs.add(d1);
        dogs.add(d2);
        dogs.add(d3);
        for (Dog dog : dogs){
            System.out.println(dog);
        }

    }
}
class Dog {
    int age;

    public Dog() {
    }

    public Dog(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "小狗[" +
                "age=" + age +
                ']';
    }
}
