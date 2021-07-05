package ExceptionPackage;

public class ExceptionTest02 {
    public static void main(String[] args) {
        MyException e = new MyException("自定义异常");//创建一个异常对象（并没有手动抛出异常）
        e.printStackTrace();//打印异常信息
        String s = e.getMessage(); // 获取异常信息
        System.out.println(s);
    }
}
