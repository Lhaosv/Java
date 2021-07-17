package IO.Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/*
IO和properties联合使用，属性配置文件
 */
public class IOandPropertiesTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src\\IO\\Properties\\IO和Propertise.properties");
            Properties pro = new Properties(); //创建一个properties集合
            pro.load(fis); //文件中的数据顺着管道加载到map集合中，其中等号=左边为key，右边为value
            System.out.println("账号：" + pro.getProperty("username"));
            System.out.println("密码：" + pro.getProperty("password"));
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
