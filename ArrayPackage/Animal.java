package ArrayPackage;

public class Animal {
    public static void main(String[] args) {
        //创建一个Animal类型的数组，用来存放Animal以及Animal子类(Cat,Bird)的对象：
        Animal[] animals ={new Animal(),new Cat(),new Bird()};  //可以存放其子类的对象！
        for (int i = 0; i < animals.length; i++) {
            animals[i].move();   // 多态！ 调用move()方法时，看具体是哪个对象。
            if (animals[i] instanceof Cat){
                Cat cat = (Cat)animals[i];  // 向下转型，用以调用子类特有的方法
                cat.Catch();  //调用Cat特有的方法
            }else if (animals[i] instanceof Bird){
                Bird bird = (Bird) animals[i];  // 向下转型，用以调用子类特有的方法
                bird.Sing();   //调用Bird特有的方法
            }
        }

        //创建一个Animal类型的数组，用于存放Person类型的对象：
//        Animal[] animals1 = new Animal[1];
//        animals1[0] = new Person();  // Aniaml类型的数组不能用来存放Person类的对象，即不能存放其他类型的对象。

    }
    public void move(){
        System.out.println("动物移动！！！");
    }
}
class Person{

}
class Cat extends Animal{
    @Override
    public void move() {
        System.out.println("猫在走猫步！！！");
    }
    public void Catch(){
        System.out.println("猫在抓老鼠！！！");
    }
}
class Bird extends Animal{
    @Override
    public void move() {
        System.out.println("小鸟在飞翔！！！");
    }
    public void Sing(){
        System.out.println("小鸟在歌唱！！！");
    }
}
