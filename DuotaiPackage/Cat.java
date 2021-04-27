package DuotaiPackage;

public class Cat extends Animal {
    @Override
    public void move() {
        System.out.println("猫在走猫步！");
    }
    //子类特有的方法
    public void eat(){
        System.out.println("小猫在吃鱼！");
    }
}
