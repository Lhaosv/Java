package PracticePackage;
//创建一个客户类,包括名字，账户
public class Customer {
    private String name;
    private Account account;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer(String name,Account account) {
        this.name = name;
        this.account = account;
    }
}
