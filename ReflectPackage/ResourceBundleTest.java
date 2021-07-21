package ReflectPackage;

import java.util.ResourceBundle;

/*
资源绑定器：
    便于获取属性配置文件中的内容
    使用以下这种方式的时候，属性配置文件xxx.properties必须放到类路径下，也就是src路径下
    文件扩展名必须是properties，并且在写路径的时候扩展名不能写。
 */
public class ResourceBundleTest {
    public static void main(String[] args) {
        ResourceBundle bundle =ResourceBundle.getBundle("ReflectPackage\\通过反射实例化对象");  //括号里面写文件路径
        String value = bundle.getString("className");  //通过key获取value
        System.out.println(value);
    }
}
