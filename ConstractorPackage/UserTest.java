package ConstractorPackage;

public class UserTest {
    public static void main(String[] args) {
        //创建user对象，调用user类的构造方法来完成对象的创建
        //以下创建了4个对象，只要有构造方法函数调用，就会创建对象，并且一点在“堆内存”中开辟内存空间。
        User u1 = new User();
        User u2 = new User(10);
        User u3 = new User(10,"小王");

    }
}
