package IntetfacePackage;
/*
定义一个中国厨师类，做中国版的菜
 */
public class ChineseCook implements Imeun{
    @Override
    public void hongShaoRou() {
        System.out.println("中国厨师做的红烧肉！！！");
    }

    @Override
    public void chaoFan() {
        System.out.println("中国厨师做的炒饭！！！");

    }
}
