package DatePackage;

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
    public static void main(String[] args) {
        Date nowtime = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(nowtime));
    }
}
