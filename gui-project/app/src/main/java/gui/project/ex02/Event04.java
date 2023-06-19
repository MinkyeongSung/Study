package gui.project.ex02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Event04 extends JFrame {

    private JButton button;
    private JLabel label;
    int counter = 0;

    public Event04() {
        this.setSize(400, 150);
        this.setTitle("이벤트 예제");

        JPanel panel = new JPanel();
        button = new JButton("증가");
        label = new JLabel("현재의 카운터값: " + counter);
        // 익명 클래스느 ActionListener 인터페이스르 구현한다. 익명 클래스의 객체도 동시에 생성된다.

        button.addActionListener((new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                counter++;
                label.setText("현재의 카운터값: " + counter);
            }
        }));
        panel.add(label);
        panel.add(button);
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Event04();
    }
}
