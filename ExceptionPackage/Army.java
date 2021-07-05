package ExceptionPackage;

public class Army {
    int count;
    public Weapon[] weapons;
    public Army(int count) {
        weapons = new Weapon[count];  //动态初始化数组，默认值为null
    }
    public void addweapens(Weapon weapon) throws AddweapenException {
        for (int i = 0; i < weapons.length; i++) {
            if (weapons[i] == null){ //如果不为空，不执行if语句，相当于for循环主体为空语句，直接i++
                weapons[i] = weapon;
                System.out.println(weapon + "武器添加成功！");
                return;
            }
        }
        //程序执行到这，说明数组已经添加满了，添加武器失败。
        throw new AddweapenException("武器数量已达上限！");

    }
    public void moveweapen(){
        for (int i = 0; i < weapons.length; i++) {
            if (weapons[i] instanceof Imoveable){  //向下转型
                Imoveable imoveable = (Imoveable) weapons[i];
                imoveable.move();
            }

        }
    }
    public void shootweapen(){
        for (int i = 0; i < weapons.length; i++) {
            if (weapons[i] instanceof Ishootable){  //向下转型
                Ishootable ishootable = (Ishootable) weapons[i];
                ishootable.shoot();
            }

        }
    }
}
