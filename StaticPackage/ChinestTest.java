package StaticPackage;

public class ChinestTest {
    public static void main(String[] args) {
        Chinese zhangsan = new Chinese(1,"张三");
        Chinese lisi = new Chinese(2,"李四");
        Chinese wangwu = new Chinese(3,"王五");
        System.out.println(zhangsan.id + "," + zhangsan.name + "," + Chinese.country);
        System.out.println(lisi.id + "," + lisi.name + "," + Chinese.country);
        System.out.println(wangwu.id + "," + wangwu.name + "," + Chinese.country);
        System.out.println(Chinese.country);
        System.out.println(zhangsan.country);
        zhangsan = null;
        System.out.println(zhangsan.country);
        //所有静态的数据都是可以采用类名.  也可以采用引用.  但是建议采用类名，的方式访问
        //采用引用.的方式访问的时候，即使引用是null，也不会出现空指针异常

    }

}
