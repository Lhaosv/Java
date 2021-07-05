package ExceptionPackage;
/*
自定义异常
两步：
    1、创建一个类继承Exception(编译时异常)或者RuntimeException(运行时异常)
    2、提供两个构造方法，一个无参数的，一个带有String参数的
 */
public class MyException extends Exception {
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
