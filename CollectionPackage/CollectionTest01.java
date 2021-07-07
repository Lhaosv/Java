package CollectionPackage;
import java.util.ArrayList;
import java.util.Collection;
/*
Collection中常用的方法
 */
public class CollectionTest01 {
    public static void main(String[] args) {
        //Collection c = new Collection();   接口是抽象的，不能实例化.
        Collection c = new ArrayList();  // 创建一个Array数组集合  (多态)
        //添加集合元素：
        c.add(100);
        c.add("abc");
        c.add(3.14);
        c.add(new Student());
        c.add("你好");
        System.out.println(c);
        System.out.println("集合元素个数为：" + c.size());  // 获取集合中元素的个数
        c.clear();  // 清空集合中的元素


        c.add(100);
        c.add("helloworld");
        System.out.println(c.contains("hello"));  // 判断当前集合中是否包含某元素，包含返回true，不好含返回false
        System.out.println(c.contains(100));


        c.remove(100);  // 删除集合中某个元素
        System.out.println(c);


        System.out.println(c.isEmpty());  //判断该集合是否为空，为空返回true，不为空返回false
        c.clear();
        System.out.println(c.isEmpty());

    }

}
class Student{

}
