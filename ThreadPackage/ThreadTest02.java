package ThreadPackage;
/*
实现多线程的第二种方式：
    编写一个类，实现Runnable接口，实现run()方法
    这种方法常用
 */
public class ThreadTest02 {
    public static void main(String[] args) {
//        //创建一个对象：
//        Mythread2 mt2 = new Mythread2();
//        //创建一个线程对象：
//        Thread t = new Thread(mt2);
        //采用匿名内部类的方式:
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("分支线程-->" + i);
                }
            }
        });
        //启动分支线程：
        t.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程-->" + i);
        }

    }
}
class Mythread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("分支线程-->" + i);

        }
    }
}
