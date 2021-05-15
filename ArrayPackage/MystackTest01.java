package ArrayPackage;

/**
 * 编写测试程序，new对象，调用push，pop方法模拟压栈弹栈动作
 */
public class MystackTest01 {
    public static void main(String[] args) {
        Mystack mystack = new Mystack();
        for (int i = 0; i < 12; i++) {
            mystack.push(new Object());
        }
        for (int i = 0; i < 9; i++) {
            mystack.pop();
        }


    }
}
