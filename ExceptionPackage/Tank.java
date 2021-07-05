package ExceptionPackage;

public class Tank extends Weapon implements Imoveable,Ishootable{
    @Override
    public void move() {
        System.out.println("坦克移动！！");
    }

    @Override
    public void shoot() {
        System.out.println("坦克开炮！！");
    }
}
