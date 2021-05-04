package IntetfacePackage;

public interface Mymath {
    public abstract int sum(int a,int b);  //接口中的方法都是抽象方法，不能有方法体。
    public abstract int sub(int a,int b);  //接口中的方法默认为public abstract，所以定义方法时可以省略
}
