package IntetfacePackage;

/**
 * 在接口中也可以使用多态
 *
 */
public class IntetfaceTest01 {
    public static void main(String[] args) {
        //父类型的引用指向子类型的对象
        Mymath mm = new Cmath();
        //调用接口里面的方法（面向接口编程）
        int rev1 = mm.sub(10,20);
        int rev2 = mm.sum(20,10);
        System.out.println(rev1);
        System.out.println(rev2);
    }
}
