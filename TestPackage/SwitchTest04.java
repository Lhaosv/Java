package TestPackage;
/*
switch可以识别char类型，他会自动将char类型转换成int类型，会将字符转换成对应的int类型的值！
 */

public class SwitchTest04 {
    public static void main(String[] args) {
        char x = 'B';
        switch (x){
            case 'B':
                System.out.println("成功！");
                System.out.println("-------------------------");
                break;
            default:
                System.out.println("出错了！");
        }
        switch (x){
            case 66:
                System.out.println("成功！");
                break;
            default:
                System.out.println("出错了！");
        }
    }
}
