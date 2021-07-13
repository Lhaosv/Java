package CollectionPackage.Set.Treeset;

import java.util.Set;
import java.util.TreeSet;
/*
对于自定义类型的类，需要实现compareTo这个接口，并根据自己想要的排序规则重写接口中的方法
 */
public class TreeSetTest02 {
    public static void main(String[] args) {
        Customer c1 = new Customer("zhangsi",20);
        Customer c2 = new Customer("zhangsan",20);
        Customer c3 = new Customer("lisi",18);
        Customer c4 = new Customer("wangwu",21);
        Set<Customer> customers = new TreeSet<>();
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);
        for (Customer customer : customers){
            System.out.println(customer);
        }


    }
}
class Customer implements Comparable<Customer>{
    public String name;
    public int age;

    public Customer() {
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "[age" + age + "]";
    }

    @Override
    public int compareTo(Customer c) {
        if (this.age == c.age){  // 年龄相同时，按照名字顺序排序
            return this.name.compareTo(c.name);  // 姓名是string类型，可以直接比，调用compareTo()方法完成
        } else {
            //年龄不一样
            return this.age - c.age;
        }
    }
}
