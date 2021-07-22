package ReflectPackage.Field;

import java.lang.reflect.Field;

/*
通过反射机制访问对象属性
    get set
 */
public class FieldTest02 {
    public static void main(String[] args) {
        try {
            Class studentclass = Class.forName("ReflectPackage.Field.Student");
            //获取no属性（根据属性名称来获取）
            Field field = studentclass.getDeclaredField("no");
            //通过反射创建实例对象：
            Object obj = studentclass.newInstance();  //obj就是student对象
            //给obj对象的no属性赋值：
            field.set(obj,100);
            //读属性的值：
            System.out.println(field.get(obj));

            //访问私有属性：
            Field namefield = studentclass.getDeclaredField("name");
            //打破封装：
            namefield.setAccessible(true);
            namefield.set(obj,"张三");
            System.out.println(namefield.get(obj));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }


    }
}

