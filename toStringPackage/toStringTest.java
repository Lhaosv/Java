package toStringPackage;
//重写toString()方法，  toString（）把对象转换成字符串的形式
public class toStringTest {
    public static void main(String[] args) {
        Date date = new Date(2021,4,22);
        System.out.println(date.toString());
        System.out.println(date);//和上面代码结果相同。
    }
}
