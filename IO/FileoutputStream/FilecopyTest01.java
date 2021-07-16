package IO.FileoutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
文件复制
 */
public class FilecopyTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("C:\\Users\\86138\\Downloads\\文件复制.jpg");
            fos = new FileOutputStream("src\\IO\\FileoutputStream\\文件复制成功.jpg");
            byte[] bytes = new byte[1024]; //一次读写1kB
            int readcount = 0;
            // 一边读一边写：
            while ((readcount = fis.read(bytes)) != -1){
                fos.write(bytes,0,readcount);
            }
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //两个关闭流异常应该分开try
            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if (fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
