package ArrayPackage;
import java.util.Scanner;

/**
 * 编写酒店管理系统，模拟退房，订房，查看所有房间状态功能。
 * 系统对外提供的功能：
 *      可以预定房间：用户输入房间编号，订房，
 *      可以退房：用户输入房间编号，退房。
 *      可以查看所有房间的状态。
 */

public class HotelSystem {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎使用酒店订房系统！");
        System.out.println("查询房间信息请按 1;"+"\n"+"订房服务请按 2;"+"\n"+"退房服务请按 3;"+"\n"+"人工服务请按 4;"+"\n"+"退出系统请按 5。");
        while (true) {
            System.out.println("请输入您想操作的编号：");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    hotel.print();
                    break;
                case 2:
                    System.out.println("请输入您要预定的房间号：");
                    int num1 = scanner.nextInt();
                    hotel.oder(num1);
                    break;
                case 3:
                    System.out.println("请输入您要退订的房间号：");
                    int num2 = scanner.nextInt();
                    hotel.exit(num2);
                    break;
                case 4:
                    System.out.println("正在呼叫人工服务，请稍等！");
                    break;
                case 5:
                    System.out.println("欢迎下次使用！");
                    return;
                default:
                    System.out.println("您输入的编号有误！请重新输入");
                    break;

            }
        }


    }
}
