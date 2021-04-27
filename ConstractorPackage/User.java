package ConstractorPackage;
/**
 * 对于构造方法来说，返回值类型不需要指定，并且不能写void，只要写上void，那么这个方法就成为了普通方法
 * 对于构造方法来说，构造方法的方法名必须和类名保持一致
 * 通过构造方法的调用可以创建对象
 * 构造方法的调用：new 构造方法名（实参列表）
 * 当一个类中没有定义任何构造方法的话，系统默认给该类提供一个无参构造方法，这个构造方法被称为缺省构造器
 * 当一个类定义了构造方法，那么系统不在默认为这个类提供缺省构造器，建议开发中手动的为当前类提供无参数的构造方法，
 * 构造方法支持重传机制
 */
//快速生成构造器的快捷键： alt+shift+s
public class User {
    //无参数的构造方法
    public User(){
        System.out.println("无参构造方法被调用了");
    }
    //有参构造方法
    public User(int i){
        System.out.println("带有int类型的构造方法被调用了");
    }
    //有参数的构造方法
    public User(int i,String name){
        System.out.println("带要int和string类型的构造方法被调用了");
    }
}
