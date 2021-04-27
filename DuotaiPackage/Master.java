package DuotaiPackage;

/**
 * 使用多态机制
 * 核心：面向抽象编程，尽量不要面向具体编程
 * 多态的作用：
 * 降低程序的耦合度，提高程序的扩展力
 * 能使用多态尽量使用多态
 * 父类型引用指向子类型对象
 */
public class Master {
    public void feed(Pet pet){
        pet.eat();
    }
}
