package IO.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
需要掌握：
采用byte数组，一次读取多个字节，最多读取数组.length个字节
采用read(byte []) 这个方法返回值是读取到的字节数量
 */
public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("idea的当前路径.txt");
            byte[] bytes = new byte[4];  // 准备一个4个长度的byte数组，一次最多读取4个字节
            int readcount = 0;
            while ((readcount = fis.read(bytes)) != -1){ //这个方法的返回值是读取到的字节数量。
                System.out.print(new String(bytes,0,readcount)); //把byte转换成字符串，读多少个转多少个
            }
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
