package ThreadPackage;
/*
终止线程的睡眠
    注意：这个不是中断线程的执行，是终止线程的睡眠
    终止t线程的睡眠（这种方式依靠了java的异常处理机制）
        t.interrupt();
 */
public class ThreadTest04 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "-->" + "begin");
                //睡一天：
                try {
                    Thread.sleep(1000 * 60 * 60 * 24);
                } catch (InterruptedException e) {
                    //e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "-->" + "end");

            }
        });
        t.setName("t");
        t.start();
        //主线程睡5秒(希望5秒之后，t线程醒来)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //终止t线程的睡眠（这种方式依靠了java的异常处理机制）
        t.interrupt();

    }
}
