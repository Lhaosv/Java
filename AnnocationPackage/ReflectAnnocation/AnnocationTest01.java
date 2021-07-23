package AnnocationPackage.ReflectAnnocation;
//以下这个类被@Myannocation直接标注
@Myannocation(username = "admin",password = "123")
public class AnnocationTest01 {
    public static void main(String[] args) {
        //通过反射获取注解中的属性
        try {
            Class c = Class.forName("AnnocationPackage.ReflectAnnocation.AnnocationTest01");
            if (c.isAnnotationPresent(Myannocation.class)){ //判断该类是否被@Myannocation注解标注
                //拿到注解类型对象：
                Myannocation myannocation = (Myannocation) c.getAnnotation(Myannocation.class);
                System.out.println(myannocation.username());
                System.out.println(myannocation.password());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
