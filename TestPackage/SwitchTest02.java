package TestPackage;
/**
 * case穿透现象：当没有break语句时，不会对后面的case进行匹配，（不进行匹配）直接执行后面语句，直到break或语句结束。
 */

import java.util.Scanner;

public class SwitchTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i){
            case 1:
                System.out.println("星期一");
            case 2:
                System.out.println("星期二");
            case 3:
                System.out.println("星期三");
                break;
            default:
                System.out.println("输入信息有误！");
        }
    }
}
