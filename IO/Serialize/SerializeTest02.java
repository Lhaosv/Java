package IO.Serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
/*
反序列化
 */
public class SerializeTest02 {
    public static void main(String[] args) {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("src\\IO\\Serialize\\序列化"));
            try {
                Object obj = ois.readObject();
                List<Student> studentList = (List<Student>) obj;
                for (Student student : studentList){
                    System.out.println(student);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (ois != null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
