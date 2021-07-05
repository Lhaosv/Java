package ArrayPackage;

import ExceptionPackage.MyException;

/**
 * 编写测试程序，new对象，调用push，pop方法模拟压栈弹栈动作
 */
public class MystackTest01 {
    public static void main(String[] args) {
        Mystack mystack = new Mystack();
        for (int i = 0; i < 12; i++) {
            try {
                mystack.push(new Object());
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        }
        for (int i = 0; i < 12; i++) {
            try {
                mystack.pop();
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        }


    }
}
