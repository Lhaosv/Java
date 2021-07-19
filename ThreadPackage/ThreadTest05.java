package ThreadPackage;
/*
终止线程
 */
public class ThreadTest05 {
    public static void main(String[] args) {
        Mythread5 mt5 = new Mythread5();
        Thread t5 = new Thread(mt5);
        t5.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //终止线程：
        mt5.run = false;  //修改Boolean的值为false


    }
}
class Mythread5 implements Runnable{
    boolean run = true;  //打一个boolean标记
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (run) {
                System.out.println(Thread.currentThread().getName() + "-->" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else {
                //在return之前可以在这里保存数据
                return;  //终止当前线程
            }
        }

    }
}
