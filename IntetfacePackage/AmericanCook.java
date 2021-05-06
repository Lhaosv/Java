package IntetfacePackage;
/*
定义一个美国厨师类，做美国版的菜
 */
public class AmericanCook implements Imeun{
    @Override
    public void hongShaoRou() {
        System.out.println("美国厨师做的红烧肉！！！");
    }

    @Override
    public void chaoFan() {
        System.out.println("美国厨师做的炒饭！！！");

    }
}
