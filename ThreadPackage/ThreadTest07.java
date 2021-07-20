package ThreadPackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
实现线程的第三种方式：（JDK8新特性）
    实现Callable接口
    这种方式的优点：可以获取到线程的执行结果
    这种方式的缺点：效率比较低，在获取t线程执行结果的时候，当前线程受阻塞，效率较低
 */
public class ThreadTest07 {
    public static void main(String[] args) {
        FutureTask task = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {  //call()方法相当于run()方法，只不过有返回值
                System.out.println("call method begin");
                Thread.sleep(1000 * 10);
                System.out.println("call method end");
                int a = 100;
                int b = 200;
                return a + b;  //自动装箱
            }
        });
        //创建线程对象：
        Thread t = new Thread(task);
        t.start();
        //调用get()方法可以获取t线程的返回结果，但get（）方法执行会导致当前线程受阻塞
        Object obj = null;
        try {
            obj = task.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("t线程执行结果：" + obj);
        //main后面的代码想要执行，必须等待get()方法的结束
        //而get方法可能需要很久，因为get方法是为了拿另一个线程的执行结果，而另一个线程的执行是需要时间的
        System.out.println("拿到结果之后的代码执行！");
    }
}
