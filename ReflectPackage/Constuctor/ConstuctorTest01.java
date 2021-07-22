package ReflectPackage.Constuctor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
/*
通过反射机制调用构造方法
 */
public class ConstuctorTest01 {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("ReflectPackage.Constuctor.Student");
            //调用无参构造方法：
            Object obj = c.newInstance();
            System.out.println(obj);
            //调用有参数构造方法：
            //先获取到有参数的构造方法：
            Constructor constructor = c.getDeclaredConstructor(int.class,String.class,int.class);
            //调用构造方法new对象：
            Object o = constructor.newInstance(101,"张三",18);
            System.out.println(o);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
