package ExceptionPackage;

public class Paijipao extends Weapon implements Ishootable{
    @Override
    public void shoot() {
        System.out.println("迫击炮开炮！！！");
    }
}
