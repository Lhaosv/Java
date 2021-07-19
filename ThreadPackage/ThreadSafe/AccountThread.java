package ThreadPackage.ThreadSafe;

public class AccountThread extends Thread {
    //两个线程必须共享同一个账户对象：
    private Account act;
    // 通过构造方法来传递账户对象：

    public AccountThread(Account act) {
        this.act = act;
    }

    @Override//run方法开始，也就是开始取钱
    public void run() {
        //假设取款3000：
        double money = 3000;
        act.qukuan(money);
        System.out.println(Thread.currentThread().getName() + "对" + act.getIDname() + "账户取款：" + money + "元," + "余额：" + act.getBalance());

    }

}
