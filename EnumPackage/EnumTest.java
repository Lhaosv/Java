package EnumPackage;

public class EnumTest {
    public static void main(String[] args) {
        Result result = devied(10,0);
        System.out.println(result == Result.success?"成功！":"失败！");

    }
    public static Result devied(int a,int b){
        try {
            int c = a/b;
            return Result.success;
        }catch (Exception e){
            return Result.fina;
        }
    }
}
