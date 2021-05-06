package IntetfacePackage;
/*
在接口中使用多态
 */
public class CanguanTest {
    public static void main(String[] args) {
        Imeun cook1 = new ChineseCook();  //创建一个中国厨师对象
        Customer customer = new Customer(cook1); //创建顾客对象
        customer.order();




    }
}
