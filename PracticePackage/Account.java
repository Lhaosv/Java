package PracticePackage;
//创建一个账户类，包括id，余额，存钱，取钱方法
public class Account {
    private String id;
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Account(String id, int balance){
        this.id = id;
        this.balance = balance;
    }
    //创建存款方法
    public void cunqian(int money){
        System.out.println("存入金额:" + money);
        System.out.println("余额：" + (balance+=money));

    }
    //创建取款方法
    public void quqian(int money){
        if (this.getBalance()<money){
            System.out.println("取款金额" + money);
            System.out.println("对不起，余额不足！");
            return;
        }
        else{
            System.out.println("取款金额" + money);
            System.out.println("余额：" + (balance-=money));
        }
    }
}
