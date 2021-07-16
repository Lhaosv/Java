package IO.FileWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/*
使用FileWriter FileReader 进行文件复制，只能复制普通文本文件
 */
public class FileWriterCopyTest01 {
    public static void main(String[] args) {
        FileWriter writer = null;
        FileReader reader = null;
        try {
            reader = new FileReader("src\\IO\\FileWriter\\FileWriterCopyTest01.java");
            writer = new FileWriter("src\\IO\\FileReader\\FileReaderCopyTest01.java");
            char[] chars = new char[1024];
            int count = 0;
            while ((count = reader.read(chars)) != -1){
                writer.write(chars,0,count);
            }
            writer.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (writer != null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }


    }
}
