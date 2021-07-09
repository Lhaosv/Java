package CollectionPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
/*
存放在集合中的类型，一定要重写equals方法。
 */

public class ContainsTest01 {
    public static void main(String[] args) {
        User u1 = new User("jack");
        Collection c1 = new ArrayList();
        c1.add(u1);  //将u1对象的内存地址添加到集合中
        User u2 = new User("jack");
        //System.out.println(c1.contains(u2)); //没有重写equals方法之前结果为false
        System.out.println(c1.contains(u2));  //重写了equals方法之后结果为true

        Integer integer1 = new Integer(100);
        Integer integer2 = new Integer(100);
        c1.add(integer1);
        System.out.println(c1.contains(integer2));  // Integer自动重写了equals方法

    }
}
class User{
    private String name;
    public User(){}

    public User(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }
}
