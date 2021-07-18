package ThreadPackage;
/*
线程的sleep()方法
    1.静态方法：Thread.sleep()
    2.参数是毫秒
    3.作用：让当前线程进入休眠，进入“阻塞状态”，放弃占用cpu时间片，让给其他线程使用
        这行代码出现在A线程中，A线程就会进入休眠
        这行代码出现在B线程中，B线程就会进入休眠
    4.Thread.sleep()可以起到这种效果：
        间隔特定的时间，去执行一段特定的代码，每隔多久执行一次
 */
public class ThreadTest03 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" +i);
                    try {
                        Thread.sleep(1000);  //每执行一次for循环，睡眠一秒
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t.setName("t");  //设置线程对象名字
        t.start();  //启动线程

    }
}
