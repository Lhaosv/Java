package CourseDesignPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.StringTokenizer;

public class NoteBook2 implements Serializable {
    public static void main(String[] args) {
        //String s = null;
        new NoteBook2();
    }

    public NoteBook2(){
        JFrame frame = new JFrame("记事本");//标题

        Container c = frame.getContentPane();//初始化一个容器
        JTextArea jt = new JTextArea();
        JButton coc = new JButton("保存");
        JButton cod = new JButton("打开");
        coc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    StringTokenizer st = new StringTokenizer(jt.getText(), "\n");
                    // 这个是一个字符串记号处理器，第一个参数是要处理的字符串，后一个是以什么
                    // 分开这个字符串这里是以\n既回车区分一个回车代表一个未读符号
                    FileOutputStream fo = new FileOutputStream("C:\\Users\\86138\\Desktop\\大学\\记事本程序.txt");
                    PrintStream so = new PrintStream(fo);
                    so.print(jt.getText());
                    so.flush();
                    so.close();
                    System.out.println(jt.getText());
                    while (st.hasMoreTokens())// 如果有未读符号
                        fo.close();
                } catch (IOException ee) {
                }
            }
        });
        cod.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FileInputStream fis = null;
                try {
                    fis = new FileInputStream("C:\\Users\\86138\\Desktop\\大学\\记事本程序.txt");
                    byte[] bytes = new byte[4];//准备一个数组，此时一次性读4个字节
                    int readCount = 0;
                    String s = null;
                    try {
                        while((readCount = fis.read(bytes))!=-1){
                            s=new String(bytes, 0, readCount);
                            jt.setText(jt.getText()+s);

                            System.out.print(s);//把byte数组转换成字符串，读到多少个转换多少个


                        }
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }

                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }finally{
                    if(fis != null){
                        try {
                            fis.close();
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                    }
                }
            }




        });
        c.add(coc, BorderLayout.NORTH);
        c.add(cod, BorderLayout.SOUTH);

        c.add(jt);
        jt.setBounds(0, 0, 800, 600);
        frame.setVisible(true);//可见性
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//关闭窗口结束程序
        frame.setBounds(500, 200, 1000, 700);//设置位置
        frame.setResizable(true);//设置可改变窗体大小
    }

}
