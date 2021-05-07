package equalsPackage;
/*
equals()方法是用来判断两个对象是否相等
在object类中的equal 方法当中，默认采用的是“==”判断两个java对象是否相等，而“==”判断的是两个对象的内存地址，而我们
应该判断的是两个对象的内容是否相等，所以需要重写子类的equals方法。
 */
public class Mytime {
    int year;
    int month;
    int day;

    public Mytime() {
    }

    public Mytime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
   // 重写equals方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;  // 如果是同一个对象，直接返回true
        if (o == null || getClass() != o.getClass()) return false;  //如果需要比较的对象不是null
        Mytime mytime = (Mytime) o;  // 向下转型(强制类型转换)  把object类中的属性转换成自定义类属性
        return year == mytime.year && month == mytime.month && day == mytime.day;
    }

}
