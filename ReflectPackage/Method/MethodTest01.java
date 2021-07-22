package ReflectPackage.Method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/*
通过反射机制调用对象方法
 */
public class MethodTest01 {
    public static void main(String[] args) {
        try {
            Class logclass = Class.forName("ReflectPackage.Method.Log");
            Method loginmethod = logclass.getDeclaredMethod("login", String.class, String.class);
            Object obj = logclass.newInstance();
            loginmethod.invoke(obj,"abc","123");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
