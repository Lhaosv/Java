package ThreadPackage.Deadlock;
/*
死锁：
    不会出现异常，程序一直僵持在那里。
    尽量不要使用synchronized嵌套，避免死锁发生。
 */
public class DeadlockTest01 {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Mythread1 t1 = new Mythread1(o1,o2);
        Mythread2 t2 = new Mythread2(o1,o2);
        t1.start();
        t2.start();

    }
}
class Mythread1 extends Thread{
    Object o1;
    Object o2;

    public Mythread1(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o1){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o2){

            }
        }
    }
}
class Mythread2 extends Thread{
    Object o1;
    Object o2;

    public Mythread2(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o2){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o1){

            }
        }
    }
}
