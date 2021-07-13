package CollectionPackage.Set.Treeset;

import java.util.Set;
import java.util.TreeSet;
/*
Treeset集合底层实际上是一个Treemap
Treemap集合底层是二叉树
放到Treeset集合中的元素，等同于放到Treemap集合中的key部分
Treeset集合中的元素，无序不可重复，但是可以按照元素的大小自动排序
 */
public class TreeSetTest01 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(100);
        set.add(123);
        set.add(56);
        set.add(888);
        set.add(100);
        for (int i:set){
            System.out.println(i);
        }
    }
}
