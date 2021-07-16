package IO.PrintStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Rizhi {
    public  static void log(String message){
        PrintStream printStream = null;
        try {
            //创建标准输出流：(之后会将输出的内容转到这个文件里)
            printStream = new PrintStream(new FileOutputStream("src\\IO\\PrintStream\\Rizhi.txt",true));
            //改变输出位置：
            System.setOut(printStream);
            //当前日期时间：
            Date date = new Date();
            //日期格式化：
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-hh:mm:ss");
            String nowtime = sdf.format(date);
            System.out.println(nowtime + ":" + message );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
