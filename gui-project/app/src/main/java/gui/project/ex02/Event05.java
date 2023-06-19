package gui.project.ex02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Event05 extends JFrame {
    private JButton button;
    private JLabel label;
    int counter = 0;

    public Event05() {
        this.setSize(400, 150);
        this.setTitle("이벤트 예제");

        JPanel panel = new JPanel();
        button = new JButton("증가");
        label = new JLabel("현재의 카운터값: " + counter);

        // 람다식을 이용하여 처리. 변수 e는 이벤트를 나타낸다. 람다식은 함수를 개체로 만들어서 메소드에 전달
        button.addActionListener(e -> {
            counter++;
            label.setText("현재의 카운터값 :" + counter);
        });

        panel.add(label);
        panel.add(button);
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Event05();
    }
}
