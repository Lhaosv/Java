package ReflectPackage.Method;
/*
登录类
 */
public class Log {
    public void login(String admin,String password){
        boolean logsuccess = "abc".equals(admin) && "123".equals(password);
        System.out.println(logsuccess? "登录成功":"登录失败");
    }
}
