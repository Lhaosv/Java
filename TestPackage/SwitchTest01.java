package TestPackage;

import java.util.Scanner;

public class SwitchTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            default:
                System.out.println("你输入的信息有误！");
        }
    }
}
