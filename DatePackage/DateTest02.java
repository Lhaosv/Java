package DatePackage;

/**
 * 计算一个方法执行所耗时长
 */
public class DateTest02 {
    public static void main(String[] args) {
        //获取1970年1月1日 00：00：00：000 到当前系统时间的总毫秒数
        long nowtimemillis = System.currentTimeMillis();
        System.out.println(nowtimemillis);

        //统计一个方法耗时
        //在调用目标方法之前调用一个毫秒数：
        long begin = System.currentTimeMillis();
        print();
        //在执行完目标方法之后记录一个毫秒数：
        long end = System.currentTimeMillis();
        System.out.println("耗费时长：" + (end-begin) + "毫秒");
    }

    private static void print() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("i = " + i);

        }
    }
}
