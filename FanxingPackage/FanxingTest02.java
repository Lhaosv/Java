package FanxingPackage;
/*
自定义泛型：
自定义泛型的时候，<>尖括号中的是一个标识符，可随便写，但一般写为T或者E，E是element单词首字母，T是type单词首字母。
 */
public class FanxingTest02<T> {  //自定义泛型T
    public static void main(String[] args) {
        FanxingTest02<String> ft = new FanxingTest02<>();  //在new对象的时候确定具体的类型  此时为string类型
        ft.dosome("helloworld!");
        //ft.dosome(123);    只能填String类型

    }
    public void dosome(T t){  //和自定义泛型一致
        System.out.println(t);
    }
}
