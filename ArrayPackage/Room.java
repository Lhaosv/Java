package ArrayPackage;

/**
 * 每一个房间Room应该有房间编号，房间类型，房间状态(即房间是否空闲)
 */

public class Room {
    private int number;
    private String type;
    private boolean status;

    public Room() {
    }

    public Room(int number, String type, boolean status) {
        this.number = number;
        this.type = type;
        this.status = status;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    //重写toString方法，返回房间编号，房间类型，房间状态
    @Override
    public String toString() {
        return "["+number+","+type+","+(status ? "空闲":"占用")+"]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return status == room.status;
    }

}
