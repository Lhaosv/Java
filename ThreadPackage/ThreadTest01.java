package ThreadPackage;
/*
实现多线程的第一种方式：
    编写一个类，直接继承Thread，重写run()方法
    这种方法不常用
 */
public class ThreadTest01 {
    public static void main(String[] args) {
        //创建一个线程对象：
        Mythread1 mt1 = new Mythread1();
        //调用start()方法，启动分支线程：
        mt1.start();  // 这个方法调用之后，瞬间结束
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程-->" + i);
        }

    }
}
class Mythread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("分支线程-->" + i);

        }
    }
}
