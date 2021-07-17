package IO.Serialize;

import java.io.Serializable;
/*
实现了 Serializable 的类建议手动生成序列号版本号
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;  //鼠标指向类名， ALT + 回车 生成序列化版本号
    private int num;
    private String name;
    //一下代码再序列化之后进行了修改，依然可以反序列化
    public int age;


    public Student() {
    }

    public Student(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}
