package PracticePackage;

/**
 * 写一个测试程序模拟银行存钱取钱操作
 * 创建一个customer，名字叫leihao，他有一个银行账户为201902566，余额为2000，
 * 对leihao进行操作：
 * 存入100元，再取出960元，再取出2000元。
 * 打印出以上操作信息
 */
public class Test01 {
    public static void main(String[] args) {
        Account account = new Account("201902566",2000);
        Customer customer = new Customer("leihao",account);//让Account类和Custormer类关联起来
        customer.getAccount().cunqian(100);
        customer.getAccount().quqian(960);
        customer.getAccount().quqian(2000);

    }
}
