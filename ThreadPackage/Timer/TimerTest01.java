package ThreadPackage.Timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
定时器
 */
public class TimerTest01 {
    public static void main(String[] args) {
        //创建定时器对象：
        Timer timer = new Timer();
        //Timer timer = new Timer(true);  守护线程的方式
        //指定定时任务
        //timer.schedule(定时任务，第一次执行的时间，间隔多久执行一次);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firsttime = null;
        try {
            firsttime = sdf.parse("2021-07-20 17:07:30");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        timer.schedule(new Logtimertask(),firsttime,1000 * 10);

    }
}

//编写一个定时任务类，继承TimerTask这个类，并实现run()方法，run方法里面的代码就是要执行的任务。
class Logtimertask extends TimerTask{

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String nowtime = sdf.format(new Date()); //当前时间
        System.out.println(nowtime + "成功完成一次记录！");

    }
}
