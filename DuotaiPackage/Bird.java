package DuotaiPackage;

public class Bird extends Animal{
    @Override
    public void move() {
        System.out.println("小鸟在飞翔！");
    }
    //子类特有的方法
    public void sing(){
        System.out.println("小鸟在歌唱！");
    }
}
