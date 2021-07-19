package ThreadPackage.ThreadSafe;

public class Account {
    private String IDname;
    private double balance;

    public Account() {
    }

    public Account(String IDname, double balance) {
        this.IDname = IDname;
        this.balance = balance;
    }

    public String getIDname() {
        return IDname;
    }

    public void setIDname(String IDname) {
        this.IDname = IDname;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    //取款方法：
    public void qukuan(double money){
        //取款之前的余额：
        double before = this.getBalance();
        //取款之后的余额：
        double after = this.getBalance() - money;
        //模拟网络延迟更新余额：
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //更新余额：
        this.setBalance(after);
    }
}
