package CourseDesignPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Calculator extends MouseAdapter {
    JFrame list;
    JTextField show;
    JButton[] jbNum = new JButton[10];
    JPanel jpMain; // 主面板
    JPanel jpRight; // 右子面板主要用于存放运算符和等号
    JPanel jpLight; // 左子面板用于存放数字,符号, “.”
    JButton dight; // 小数点
    JButton add; // 加号
    JButton sub; // 减号
    JButton multiply; // 乘号
    JButton divide; // 除号
    JButton ce; // 清除
    JButton equal; // 等于
    JButton sqrt; // sqrt
    double sum = 0; // 临时结果
    boolean b = false; // 监控运算符是否被点击,错误是否出现，用于实现下一次点击按钮时清空
    operator i = operator.un; // 记录等号符点击前某一运算符点击次数，用于实现连加或者连减等

    int op; // 记录操作符

    // 操作符一包括+-*/
    enum operator {
        add, sub, mul, div, sqrt, un
    }

    void display() {
        // 创建主窗口，添加一个Text框，
        list = new JFrame("计算器");
        list.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//点击X关闭
        list.setBounds(600, 550,360, 230);//设置组件大小
        list.setResizable(false);//不可放大窗口
        list.setLayout(new FlowLayout(FlowLayout.CENTER));//设置输入框放置在中间
        show = new JTextField(31);//长度为31的文本显示框
        show.setHorizontalAlignment(JTextField.RIGHT); // 文本框内文字右对齐
        list.add(show);
        // 创建面板并设置布局
        jpMain = new JPanel();
        jpRight = new JPanel();
        jpLight = new JPanel();
        jpMain.setLayout(new GridLayout(1, 2));
        jpRight.setLayout(new GridLayout(4, 2, 3, 3));
        jpLight.setLayout(new GridLayout(4, 3, 3, 3));
        list.add(jpMain);
        jpMain.add(jpLight);
        jpMain.add(jpRight);
        // 创建0~9按钮对象
        for (int i = 9; i >= 0; i--) {
            jbNum[i] = new JButton(String.valueOf(i));//提示不兼容类型
            //jbNum[i].setForeground(Color.BLUE);
            jpLight.add(jbNum[i]);
            jbNum[i].addMouseListener(this);
        }
        add = new JButton("+");
        sub = new JButton("-");
        multiply = new JButton("*");
        divide = new JButton("/");
        ce = new JButton("CE");
        equal = new JButton("=");
        sqrt = new JButton("sqrt");
        jpRight.add(divide);
        jpRight.add(sqrt);
        jpRight.add(multiply);
        jpRight.add(sub);
        jpRight.add(ce);
        jpRight.add(add);
        jpRight.add(equal);

        // 给所有按钮注册监听器
        dight = new JButton(".");
        jpLight.add(dight);
        add.addMouseListener(this);
        sub.addMouseListener(this);
        multiply.addMouseListener(this);
        divide.addMouseListener(this);
        ce.addMouseListener(this);
        equal.addMouseListener(this);
        sqrt.addMouseListener(this);
        dight.addMouseListener(this);
        list.setVisible(true);

    }

    public void mouseClicked(MouseEvent e) {
        // 0~9的输入
        if (e.getSource() == jbNum[0]) {
            input(0, e);
        }
        if (e.getSource() == jbNum[1]) {
            input(1, e);
        }
        if (e.getSource() == jbNum[2]) {
            input(2, e);
        }
        if (e.getSource() == jbNum[3]) {
            input(3, e);
        }
        if (e.getSource() == jbNum[4]) {
            input(4, e);
        }
        if (e.getSource() == jbNum[5]) {
            input(5, e);
        }
        if (e.getSource() == jbNum[6]) {
            input(6, e);
        }
        if (e.getSource() == jbNum[7]) {
            input(7, e);
        }
        if (e.getSource() == jbNum[8]) {
            input(8, e);
        }
        if (e.getSource() == jbNum[9]) {
            input(9, e);
        }

        // 小数点,CE,等号
        if (e.getSource() == dight) {
            if (show.getText().indexOf('.') == -1) {
                show.setText(show.getText() + ".");
            }

        }
        if (e.getSource() == ce) {
            show.setText("0");
            sum = 0;
            i = operator.un;
            b = false;
        }
        outer: if (e.getSource() == equal) {
            try {
                if (i == operator.un) {
                    b = true;
                } else {
                    if (i == operator.add) {
                        sum += Double.parseDouble(show.getText());

                    }
                    if (i == operator.sub) {
                        sum -= Double.parseDouble(show.getText());

                    }
                    if (i == operator.mul) {
                        sum *= Double.parseDouble(show.getText());

                    }
                    if (i == operator.div) {
                        if (Double.parseDouble(show.getText()) != 0) {
                            sum /= Double.parseDouble(show.getText());

                        } else {
                            show.setText("ERROR");
                            b = true;
                            sum = 0;
                            break outer; // 不执行trimIn()方法 屏幕显示错误
                        }
                    }
                    trimIn(sum);
                }
            } catch (Exception ex) {
                show.setText("ERROR");
                b = true;
                sum = 0;
            }

            sum = 0;
            i = operator.un;
            b = true;
        }
        if (e.getSource() == add) {
            cal(i);
            i = operator.add;
            b = true;

        }
        if (e.getSource() == sub) {
            cal(i);
            i = operator.sub;
            b = true;

        }
        if (e.getSource() == multiply) {
            cal(i);
            i = operator.mul;
            b = true;

        }
        if (e.getSource() == divide) {
            cal(i);
            i = operator.div;
            b = true;

        }
        try {
            if (show.getText() != "ERROR") {
                if (e.getSource() == sqrt) {
                    sum = Math.sqrt(Double.parseDouble(show.getText()));
                    trimIn(sum);
                    b = true;
                }
            }
        } catch (Exception ex) {
            show.setText("ERROR");
            b = true;
        }
    }

    // 用以四则运算和求幂和取模的方法
    public void cal(operator i) {
        try {
            if (show.getText() != "ERROR") {
                if (i == operator.un) {
                    sum = Double.parseDouble(show.getText());
                }
                if (i == operator.add) {
                    sum += Double.parseDouble(show.getText());
                    trimIn(sum);
                }
                if (i == operator.sub) {
                    sum -= Double.parseDouble(show.getText());
                    trimIn(sum);
                }
                if (i == operator.mul) {
                    sum *= Double.parseDouble(show.getText());
                    trimIn(sum);
                }
                if (i == operator.div) {
                    if (Double.parseDouble(show.getText()) != 0) {
                        sum /= Double.parseDouble(show.getText());
                        trimIn(sum);
                    } else {
                        //出现0后，把一切数据重置
                        show.setText("ERROR");
                        sum = 0;
                        b = true;
                        i=operator.un;
                    }
                }
            }
        } catch (Exception ex) {
            show.setText("ERROR");
            b = true;
        }
    }

    // 点击数字输入
    public void input(int i, MouseEvent e) {
        if (b == true) {
            show.setText(String.valueOf(i));//返回返回原始值
            b = false;
        } else {
            //判断0和.来清除整数时后面的点
            if (show.getText().indexOf('0') == 0 && e.getSource() != dight) {
                show.setText(String.valueOf(i));
            } else {
                show.setText(show.getText() + String.valueOf(i));
            }
        }
    }

    // sum的显示，整数的去掉小数点和0
    public void trimIn(double sum) {
        if (String.valueOf(sum).indexOf('.') != -1
                && String.valueOf(sum).endsWith("0")) {
            show.setText((String.valueOf(sum).substring(0, String.valueOf(sum)
                    .indexOf('.'))));

        } else if (Double.isNaN(sum)) {
            show.setText("ERROR");         //不 是数字时 屏幕显示错误，并把sum置于0 运算符置UN
            b = true;
            sum = 0;
            i = operator.un;
        } else if (Double.isInfinite(sum)) {
            show.setText("ERROR");          //出现infinite(无限大)时显示错误SUM置0运算符置UN
            b = true;
            sum = 0;
            i = operator.un;
        } else {
            show.setText(String.valueOf(sum));
        }
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.display();

    }
}
