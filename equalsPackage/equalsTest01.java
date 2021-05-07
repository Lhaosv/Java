package equalsPackage;
/*
调用equals方法判断两个对象是否相等（对象内容是否相等）
 */
public class equalsTest01 {
    public static void main(String[] args) {
        Mytime mt1 = new Mytime(2021,5,7);
        Mytime mt2 = new Mytime(2021,5,7);
        System.out.println(mt1.equals(mt2));
    }
}
