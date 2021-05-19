package DatePackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * yyyy  年（年是4位）
 * MM    月（月是2位）
 * dd    日（日是2位）
 * HH    小时
 * mm    分钟
 * ss    秒
 */
public class DateTest01 {
    public static void main(String[] args) throws ParseException {

        //获取当前时间，并转换为习惯的显示模式：
        Date nowtime = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(nowtime));

        //对给定的时间进行解析：
        String time = "2000-10-27 10:23:15";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //格式必须于给出的格式保持一致
        System.out.println(sdf1.parse(time));

    }

}
