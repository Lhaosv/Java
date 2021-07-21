package ReflectPackage;
/*
获取字节码文件的三种方式：
    第一种：Class c = Class.forName("完整类名带包名);
    第二种：Class c = 对象.getClass();
    第三种：Class c = 任何类型.class;
 */
public class ReflectTest01 {
    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("ReflectPackage.ReflectTest01");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        ReflectTest01 rt = new ReflectTest01();
        //java中任何一个对象都有getClass()方法
        Class x = rt.getClass();  //x代表ReflectTest01.class字节码文件，x代表ReflectTest01类型
        System.out.println(x == c);  //（==判断的时对象的内存地址）
        //第三种方式：java语言中任何一种数据类型，包括基本数据类型，他都有.class属性
        Class s =String.class; //s代表string类型
        Class i = int.class; // i代表int类型
        Class d = double.class;  //d代表double类型
    }

}
