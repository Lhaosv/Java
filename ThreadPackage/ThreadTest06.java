package ThreadPackage;
/*
线程合并
 */
public class ThreadTest06 {
    public static void main(String[] args) {
        Thread thread =new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + i);
                }
            }
        });
        System.out.println("main-->begin");
        thread.start();
        thread.setName("t");
        //t线程合并到当前线程中，当前线程受到阻塞，直到t线程执行结束
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main-->over");
    }
}
