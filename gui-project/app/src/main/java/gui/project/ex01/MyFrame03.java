package gui.project.ex01;

import javax.swing.*;
import java.awt.*;

public class MyFrame03 extends JFrame {
    public MyFrame03() {
        JPanel panel = new JPanel(); // 패널 생성
        panel.setBackground(Color.orange); // 패널 배경색 변경

        JButton b1 = new JButton("Button 1"); // 버튼 생성.
        b1.setBackground(Color.yellow); // 버튼의 배경색

        JButton b2 = new JButton("Button 2");
        b2.setBackground(Color.green);

        panel.add(b1); // 버튼을 패널에 추가한다.
        panel.add(b2); // 버튼을 패널에 추가한다.
        add(panel); // 패널을 프레임에 추가한다.
        setTitle("MyFrame03");
        setSize(300, 150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MyFrame03();
    }
}
