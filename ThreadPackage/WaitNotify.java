package ThreadPackage;
/*
使用消费者生产者模式实现交替输出奇偶数。
 */
public class WaitNotify {
    public static void main(String[] args) {
        //创建一个数对象：
        Num num = new Num();
        //创建两一个奇数线程，一个偶数线程，共享同一个数num对象：
        Thread t1 = new Thread(new jiShu(num));
        Thread t2 = new Thread(new OuShu(num));
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();

    }
}
// 数类：
class Num {
    int i = 1;
}
// 奇数线程类：
class  jiShu implements Runnable{
    Num num;

    public jiShu(Num num) {
        this.num = num;
    }

    @Override
    public void run() {
        while (num.i<10){
            synchronized (num){
                if (num.i % 2 == 0){
                    try {
                        num.wait();  //如果是偶数，当前线程进入等待状态，并释放对象num的锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //输出奇数并i++
                System.out.println(Thread.currentThread().getName() + "-->" + (num.i++));
                try {
                    Thread.sleep(1000); // 睡一秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                num.notify();  // 唤醒偶数线程
            }
        }

    }
}
// 偶数线程类：
class OuShu implements Runnable{
    Num num;

    public OuShu(Num num) {
        this.num = num;
    }

    @Override
    public void run() {
        while (num.i<10){
            synchronized (num) {
                if (num.i % 2 == 1) {
                    try {
                        num.wait(); //如果是奇数数，当前线程进入等待状态，并释放对象num的锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + "-->" + (num.i++));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                num.notify();  // 唤醒奇数线程
            }
        }
    }
}
