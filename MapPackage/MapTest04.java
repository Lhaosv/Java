package MapPackage;


import java.util.HashSet;
import java.util.Set;

public class MapTest04 {
    public static void main(String[] args) {
        Product p1 = new Product("手机",101);
        Product p2 = new Product("手机",101);
        Set<Product> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        System.out.println(p1.equals(p2));
        System.out.println("p1的hashcode值：" + p1.hashCode());  //25001911
        System.out.println("p2的hashcode值：" + p2.hashCode());  //25001911
        System.out.println(set.size());  //set集合的特点：无序不可重复（重写了hashcode和equals方法）
    }
}
