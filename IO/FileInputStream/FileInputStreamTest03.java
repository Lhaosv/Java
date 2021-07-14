package IO.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("idea的当前路径.txt");
            byte[] bytes = new byte[fis.available()];  //fis.available()这个方法返回流中剩余的没有读到字节数量
            fis.read(bytes);  // 通过byte数组一次读取多个字节
            System.out.println(new String(bytes));  // 把byte数组转换成字符串
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
