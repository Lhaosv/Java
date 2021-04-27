package StaticPackage;

public class Chinese {
    int id;
    String name;
    static String country = "中国";//所有的对象国籍都一样，这种特征属于类级别的特征，可以提升为整个模板的特征，可以加static关键字修饰
                                    //静态变量在类加载的时候就初始化，不需要在创建对象，内存就开辟了
                                    //静态变量存储在方法区内存中
    public Chinese() {
    }

    public Chinese(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
