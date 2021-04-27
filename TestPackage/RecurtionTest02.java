package TestPackage;
/*
运用递归  计算n的阶乘
 */

public class RecurtionTest02 {
    public static void main(String[] args) {
        int n = 5;
        int retvatue = method(n);
        System.out.println(retvatue);

    }
    public static int method(int n){
        if (n==1){
            return 1;
        }
        return n=n*method(n-1);


    }
}
