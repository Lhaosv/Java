package ThisPackage;

public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        Customer c2 = new Customer();
        c1.name = "张三";
        c2.name = "李四";
        c1.shop();
        c2.shop();

    }
}
