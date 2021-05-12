package ArrayPackage;

public class ArrayTest01 {
    //用户名和密码输入到String[] args数组当中。
    public static void main(String[] args) {
        if (args.length != 2){
            System.out.println("使用该系统时请输入程序参数，包括用户名和密码信息，例如：zhangsan 123");
            return;
        }//程序执行到此处说明确实提供了用户名和密码，接下来判断用户名和密码是否正缺
        //取出用户名：
        String username = args[0];
        //取出密码：
        String password = args[1];
        if ("admin".equals(username)&&"123".equals(password)){
            System.out.println("登录成功，欢迎回来！");
        }
        else {
            System.out.println("验证失败，用户名或密码错误！");
        }
    }
}
