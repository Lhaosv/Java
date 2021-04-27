package FengzhuangPackage;

public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        user.setAge(10);
        user.setName("张三");
        System.out.println(user.getAge());
        System.out.println(user.getName());
    }
}
