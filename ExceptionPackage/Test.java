package ExceptionPackage;

public class Test {
    public static void main(String[] args) {
        Army army = new Army(3);

        Weapon tank = new Tank();
        tank.setName("坦克");

        Weapon paijipao = new Paijipao();
        paijipao.setName("迫击炮");

        Weapon zhuangjiache = new Zhuangjiache();
        zhuangjiache.setName("装甲车");

        Weapon tank2 = new Tank();
        tank2.setName("坦克2号");
        //添加武器：
        try {
            army.addweapens(tank);
            army.addweapens(paijipao);
            army.addweapens(zhuangjiache);
            army.addweapens(tank2);
        } catch (AddweapenException e) {
            System.out.println(e.getMessage());
        }
        army.moveweapen(); // 输出可移动的武器
        army.shootweapen();  //输出可射击的武器

    }
}
