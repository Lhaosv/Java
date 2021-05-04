package SuperPackage;

/**
 * super()表示通过子类的构造方法调用父类的构造方法
 * 模拟现实中的场景：想要有儿子，必需先要有父亲
 *
 * 重要结论：
 * 当一个构造方法第一行：
 *      既没有this()又没用super()的话，默认会有一个super();
 *      表示通过当前子类的构造方法调用父类的无参数构造方法
 *      所以必须保证父类的无参数方法是存在的
 *注意：
 *      this()和super()不能共存，他们都只能出现再构造方法的第一行。
 *      无论怎样，父类的构造方法一定会执行。
 */
//程序运行结果为1 3 6 5 4
public class SuperTest01 {
    public static void main(String[] args) {
        new C();

    }

}
class A {
    public A(){
        //默认有一个super();
        System.out.println("1");
    }

}
class B extends A {
    public B(){
        //默认有一个super();
        System.out.println("2");
    }
    public B(String name){
        //默认有一个super();
        System.out.println("3");

    }

}
class C extends B {
    public C(){
        this("zhangsan");
        System.out.println("4");
    }
    public C(String name){
        this(name,20);
        System.out.println(5);

    }
    public C(String name,int age){
        super(name);
        System.out.println("6");

    }

}
