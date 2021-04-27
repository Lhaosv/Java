package FengzhuangPackage;
/*
封装的步骤：
1.所有属性私有化，使用private关键字进行修饰，private表示私有的，修饰的所有数据只能在本类中访问
私有属性不能在外部直接访问，这就是封装
2.对外提供简单操作入口，外部程序想要访问私有属性，必须通过简单的入口进行访问
   -对外提供两个公开的方法，分别是set方法和get方法
   -想修改私有属性，调用set方法
   -想读取私有属性，调用get方法
把鼠标放在私有属性变量上，按alt+enter，使用快捷键自动添加set，get方法
 */

public class User {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0 || age>150){
            System.out.println("你输入的年龄不合法！");
            return;
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
