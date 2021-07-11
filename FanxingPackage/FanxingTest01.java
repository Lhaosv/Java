package FanxingPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
使用泛型机制
使用泛型List<Animal>之后表示List集合中只允许存储Animal类型的数据。
 */
public class FanxingTest01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Bird bird = new Bird();
        List<Animal> list = new ArrayList<Animal>();  //使用泛型List<Animal>
        list.add(cat);
        list.add(bird);
        //获取迭代器，迭代器也有泛型：
        Iterator<Animal> it = list.iterator();
        while (it.hasNext()){
            Animal a = it.next();  //使用泛型List<Animal>之后，得到的类型就是Animal类型
            a.move();
        }
        System.out.println("---------------------------------");
        Iterator<Animal> iterator = list.iterator();  //重新获取迭代器
        while (iterator.hasNext()){
            Animal animal = iterator.next();
            if (animal instanceof Cat){
                Cat c = (Cat) animal;
                c.catchMouse();
            }
            if (animal instanceof Bird){
                Bird b = (Bird) animal;
                b.fly();
            }
        }



    }
}
class Animal{
    public void move(){
        System.out.println("动物移动！");
    }
}
class Cat extends Animal{
    public void catchMouse(){
        System.out.println("猫抓老鼠！");
    }
}
class Bird extends Animal{
    public void fly(){
        System.out.println("小鸟飞翔！");
    }
}
