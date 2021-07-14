package IO.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
一次读取一个字节，内存和硬盘交互太频繁，一般不用这种方法。
IDEA中的当前路径是Project项目的根开始。
 */

public class FileInputStreamTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        int readdata = 0;
        try {
            //创建文件输入流对象：
            fis = new FileInputStream("idea的当前路径.txt");
            //调用read()方法，返回的是字节值：
            while ((readdata = fis.read()) != -1){
                System.out.println(readdata);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
