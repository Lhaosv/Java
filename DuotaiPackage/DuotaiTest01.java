package DuotaiPackage;

public class DuotaiTest01 {
    public static void main(String[] args) {
        Animal a1 = new Cat();  //父类型引用指向子类型对象  （向上转型也称为自动类型转换）
        a1.move();  //编译阶段编译器检查a1这个引用的数据类型为Animal类型，由于Animal.class字节码中有move方法，
                    //所以编译通过了。这个过程我们成为静态绑定，只要静态绑定成功之后才有后续的运行
                    //在程序运行阶段，jvm堆内存中真是创建的对象是Cat对象，那么就会调用Cat对象的move方法，此时
                    //发生了程序的动态绑定，运行阶段的绑定
        //无论Cat类有没有重写move方法，运行阶段一定调用的是Cat对象的move方法，因为底层的真实对象就是Cat对象


        //a1.eat();   //程序编译错误，因为编译器检查到a1的类型是Animal类型，
                      //从Animal.class字节码文件当中查找eat();方法，最终没有找到该方法，导致动态绑定失败，编译错误。
        /**
         * 假设想调用eat（）方法，应该怎么做？
         * a1是无法直接调用的，因为a1的类型Animal,Animal中没有eat()方法。
         * 我们可以将a1强制类型转换为cat类型。
         * a1的类型是Animal(父类），转换成cat类型（子类），被称为向下转型/downcasting/强制类型转换。
         * 注:问下转型也需要两种类型之间必须有继承关系。不然编译报错。强制类型转换需要加强制类型转换符。
         * 什么时候需要使用向下转型呢?
         *
         * 当调用的方法是子类型中特有的，在父类型当中不存在，必须进行向下转型。
         */
        Cat cat = (Cat) a1;
        cat.eat();
    }
}
