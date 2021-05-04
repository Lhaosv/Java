package IntetfacePackage;

public class Cmath implements Mymath{
    //一个非抽象类实现一个接口时，必须重写接口中的所有抽象方法
    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }
}
