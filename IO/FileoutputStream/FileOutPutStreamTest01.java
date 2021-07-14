package IO.FileoutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutPutStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            //后面加一个true表示会保留原文件中的内容，继续再后面写
            //如果没有该文件，会自动创建这个文件
            fos = new FileOutputStream("src\\IO\\FileoutputStream\\Fileoutputstream.txt",true);
            String s = "往文件中写文件成功！";   // 需要写入的内容
            byte[] bytes = s.getBytes(StandardCharsets.UTF_8);  // 将字符串转换成byte[] 数组
            fos.write(bytes);  // 将byte[]数组写入文件中
            fos.flush();  // 输出流需要刷新，养成习惯
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
