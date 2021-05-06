package IntetfacePackage;
/*
定义一个顾客类，有菜单属性，可通过菜单点菜
 */
public class Customer {
    private Imeun imeun;

    public Imeun getImeun() {
        return imeun;
    }

    public void setImeun(Imeun imeun) {
        this.imeun = imeun;
    }
    public Customer(){

    }

    public Customer(Imeun imeun) {
        this.imeun = imeun;
    }
    public void order(){
        imeun.hongShaoRou();
        imeun.chaoFan();
    }
}
