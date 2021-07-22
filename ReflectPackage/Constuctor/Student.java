package ReflectPackage.Constuctor;
/*
学生类
 */
public class Student {
    int no;
    String name;
    int age;

    public Student() {
    }

    public Student(int no, String name, int age) {
        this.no = no;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
