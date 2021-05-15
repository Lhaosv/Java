package ArrayPackage;

/**
 * 酒店中有房间，使用二维数组来表示房间
 */

public class Hotel {
    private Room[][] rooms;

    public Hotel() {
        rooms = new Room[3][10];  // 创建一个3*10的二维数组，表示酒店有3层，每层楼有10间房

        //创建酒店中的每一个房间，存入二维数组中：
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (i+1 == 1){
                    rooms[i][j] = new Room((i+1)*100+j+1,"单人间",true);
                }
                else if(i+1 == 2){
                    rooms[i][j] = new Room((i+1)*100+j+1,"标准间",true);
                }
                else if (i+1 == 3){
                    rooms[i][j] = new Room((i+1)*100+j+1,"豪华间",true);
                }

            }

        }

    }

    //打印出酒店所有房间的信息：
    public void print(){
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                Room room =rooms[i][j];
                System.out.print(room);  //等同于 System.out.print(room.toString);
            }
            System.out.println(); //每打印完一层换行
        }
    }

    //订房：
    public void oder(int roomNum){
        Room r1 = rooms[roomNum/100-1][roomNum%100-1];
        if (r1.getStatus() == true){
            System.out.println("订房成功！");
            r1.setStatus(false);
        }
        else {
            System.out.println("对不起，该房间已被订！");
        }


    }

    //退房：
    public void exit(int roomNum){
        Room r2 = rooms[roomNum/100-1][roomNum%100-1];
        r2.setStatus(true);
        System.out.println("退房成功，欢迎下次光临！");

    }
}
