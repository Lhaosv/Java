package TestPackage;
/*
运用递归   求1-n的和
 */

public class RecurtionTest01 {
    public static void main(String[] args) {
        int n = 4;
        int retvalue = sum(n);
        System.out.println(retvalue);

    }
    public static int sum(int n){
        if (n==1){
            return 1;
        }
        return n=n+sum(n-1);
    }
}
