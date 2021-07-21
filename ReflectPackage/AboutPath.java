package ReflectPackage;
/*
获取类路径下文件的绝对路径：
 */
public class AboutPath {
    public static void main(String[] args) {
        String path = Thread.currentThread().getContextClassLoader().getResource("ReflectPackage\\abc.properties").getPath();
        System.out.println(path);

    }
}
