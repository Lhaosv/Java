package ThreadPackage.ThreadSafe2;

/*
客户端类
    使用synchronized方法，解决线程安全问题
 */
public class AccontTest {
    public static void main(String[] args) {
        //创建一个账户类：
        Account act = new Account("张三_1001",10000);
        //创建两个不同的线程t1和t2(模拟两个人同时对同一个账户进行取款)：
        Thread t1 = new AccountThread(act);
        Thread t2 = new AccountThread(act);
        t1.setName("t1");
        t2.setName("t2");
        //启动线程t1和t2，同时取款操作：
        t1.start();
        t2.start();


    }
}
