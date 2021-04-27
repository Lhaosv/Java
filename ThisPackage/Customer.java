package ThisPackage;

/**
 * 关于Java中的this关键字：
 *   1.this是一个关键字，可翻译为：”这个“
 *   2.this是一个引用，this是一个变量，this变量中保存了内存地址指向了自身，this储存在jvm堆内存Java对象内部
 *   3.创建100个对象，每一个对象都有this，也就说有100个不同的this
 *   4.this可以出现在实例方法当中，指向当前正在执行这个动作的对象
 */

public class Customer {
    public String name;

    public void shop(){
        //当张三在购物的时候输出张三在购物
        //当李四在购物的时候输出李四在购物
        System.out.println(this.name + "在购物");
    }
}
