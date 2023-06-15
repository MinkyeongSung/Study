package gui.project.ex01;

import java.awt.*;
import javax.swing.*;

public class MyFrame04 extends JFrame {
    public MyFrame04() {
        setTitle("FlowLayoutTest");
        setSize(300, 150);
        setLayout(new FlowLayout()); // 프레임의 배치관리자를 FlowLayout으로 지정

        add(new JButton("Button1"));
        add(new JButton("Button2"));
        add(new JButton("Button3"));
        add(new JButton("Button4"));
        add(new JButton("Button5"));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MyFrame04();
    }
}
