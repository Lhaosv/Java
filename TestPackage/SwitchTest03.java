package TestPackage;
/*
case合并现象测试
 */


import java.util.Scanner;

public class SwitchTest03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        switch (s){
            case "星期一": case "星期二"://cake合并现象。
                System.out.println(1);
                break;
            default:
                System.out.println("你输入的信息有误！");
        }
    }
}
