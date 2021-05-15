package ArrayPackage;

/**
 *  使用一维数组，模拟栈数据结构
 *  要求：
 *      1.这个栈可以存储java中任何引用数据类型
 *      2.在栈中提供push方法模拟压栈，（栈满了，给出提示信息）
 *      3.在栈中提供pop方法模拟弹栈，（栈空了，给出提示信息）
 *      4.编写测试程序，new对象，调用push，pop方法模拟压栈弹栈动作
 */
public class Mystack {
    private Object[] elements; // 定义一个object类型的一维数组，用以存放所有类型的引用数据类型
    private int index;  // 定义一个栈帧，始终表示指示栈顶元素，也就是栈顶元素的下标

    public Mystack() {
        elements = new Object[10];  //动态初始化一个长度为10的数组
        index = -1;  // 默认栈帧为-1，即空栈
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    //定义一个push方法，模拟压栈
    public void push(Object obj){
        if (index >= elements.length-1){
            System.out.println("压栈失败，栈以满！");
            return;
        }
        index++;  //每压一个元素，栈帧+1
        elements[index] = obj;  // 把压进去的元素放入数组中
        System.out.println("压栈" + obj + "元素成功！ " + "栈帧指向" + index);
    }
    public void pop(){
        if (index < 0){
            System.out.println("栈为空，弹栈失败！");
            return;
        }
        System.out.println("弹栈" + elements[index] + "元素成功! " + "栈帧指向" + --index);

    }
}
