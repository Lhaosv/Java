package SuperPackage;

public class SuperTest02 {
    public static void main(String[] args) {
        Vip vip = new Vip("张三");
        vip.shop();
    }
}
class Customer {
    String name;

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
    }
}
class Vip extends Customer {

    public Vip() {
    }

    public Vip(String name) {
        super(name);
    }
    public void shop(){
        System.out.println(this.name + "正在购物！");  //张三正在购物！
        System.out.println(super.name + "正在购物！");  //张三正在购物！
        System.out.println(name + "正在购物！");  //张三正在购物！
    }
}
