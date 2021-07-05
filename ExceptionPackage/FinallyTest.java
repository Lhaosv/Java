package ExceptionPackage;
/*
finally面试题
 */
public class FinallyTest {
    public static void main(String[] args) {
        int result = dosome();
        System.out.println(result);  //输出100
    }
    public static int dosome()
    {
        int i = 100;
        try {
            return i;
        }finally {
            i++;
        }
    }

}
