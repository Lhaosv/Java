package ReflectPackage;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
反射Student类中的所有field
 */
public class FieldTest01 {
    public static void main(String[] args) {
        try {
            //获取Student类的字节码文件：
            Class studentClass = Class.forName("ReflectPackage.Student");
            String classname = studentClass.getName();  //获取完整类名
            System.out.println("完整类名：" + classname);
            String simplename = studentClass.getSimpleName(); //获取简单类名
            System.out.println("简单类名：" + simplename);
            //获取类中所有public修饰的field：
            Field[] fields = studentClass.getFields();
            //取出这个field：
            Field field = fields[0];
            //得到这个field名字：
            System.out.println(field.getName());
            //获取所有的field：
            Field[] fs = studentClass.getDeclaredFields();
            System.out.println(fs.length);
            System.out.println("================");
            //遍历：
            for(Field field1 : fs){
                //获取属性的修饰符列表：
                int i = field1.getModifiers();
                String modifiername = Modifier.toString(i);
                System.out.println(modifiername);
                //获取属性类型：
                Class type = field1.getType();
                System.out.println(type.getSimpleName());
                //获取属性的名字：
                System.out.println(field1.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
class Student {
    public int no;
    private  String name;
    int age;
    boolean sex;
}
