package AnnocationPackage.ReflectAnnocation;

import java.lang.reflect.Method;

/*
通过反射获取标注在方法上的注解
 */
public class AnnocationTest02 {
    public static void main(String[] args) {
        try {
            Class c2 = Class.forName("AnnocationPackage.ReflectAnnocation.AnnocationTest02");
            //获取被注解标注的方法：
            Method dosomemethod = c2.getDeclaredMethod("dosome");
            if (dosomemethod.isAnnotationPresent(Myannocation.class)){
                Myannocation myannocation = dosomemethod.getAnnotation(Myannocation.class);
                System.out.println(myannocation.username());
                System.out.println(myannocation.password());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }
    //标注在方法上的注解：
    @Myannocation(username = "admin",password = "123456789")
    public void dosome(){

    }
}
