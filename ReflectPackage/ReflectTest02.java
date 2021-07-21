package ReflectPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
通过反射实例化对象：
    通过Class的newInstance方法来实例化对象
    newInstance()方法内部实际调用了无参数构造方法，必须保证无参数构造方法存在才可以。
 */
public class ReflectTest02 {
    public static void main(String[] args) {
        //这种方式代码写死了，只能创建一个User类型对象：
        User user = new User();
        System.out.println("======================");
        //一下代码是灵活的，代码不需要改动，可以修改配置文件，配置文件修改之后可以创建不同的实例对象：
        FileReader reader = null;
        try {
            //通过Io流读取properties文件：
            reader = new FileReader("src\\ReflectPackage\\通过反射实例化对象.properties");
            Properties pro = new Properties();  //创建properties集合
            pro.load(reader);  //将文件通过管道传入流
            reader.close();
            String classname = pro.getProperty("className");  //获取类名
            Class c = Class.forName(classname);  //获取字节码文件
            Object obj = c.newInstance();  //通过字节码文件实例化对象
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }


    }
}
