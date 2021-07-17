package IO.Serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
/*
序列化
 */

public class SerializeTest01 {
    public static void main(String[] args) {
        //创建一个集合对象：
        List<Student> list = new ArrayList<>();
        list.add(new Student(101,"张三"));
        list.add(new Student(102,"李四"));
        list.add(new Student(103,"王五"));
        //序列化：
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("src\\IO\\Serialize\\序列化"));
            oos.writeObject(list);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
