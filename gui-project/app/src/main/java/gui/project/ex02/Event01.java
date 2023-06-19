package gui.project.ex02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Event01 extends JFrame {

    private JButton button;
    private JButton button2;
    private JLabel label;
    int counter = 0;

    public Event01() {
        setSize(600, 200);
        setLayout(new FlowLayout());

        button = new JButton("증가");
        button2 = new JButton("2증가");
        label = new JLabel("현재의 카운터값: " + counter);

        // 난 클래스가 아니라 메서드를 주입하고 싶은데, 자바 언어 특성상 어쩔 수 없이 클래스를 주입한다.

        button.addActionListener(new Inner());
        button2.addActionListener(new Inner2());

        add(button);
        add(button2);
        add(label);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    class Inner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) { // 이벤트 객체

            // 확인.
            JButton btn = (JButton) e.getSource();
            System.out.println("버튼 클릭됨 : " + e);
            System.out.println(btn.getText());

            counter++;
            System.out.println(counter);

            label.setText("현재의 카운터값: " + counter);// 다시그림
        }
    }

    class Inner2 implements ActionListener {
        // 콜백 메서드
        @Override
        public void actionPerformed(ActionEvent e) {
            counter = counter + 2;
            System.out.println(counter);

            label.setText("현재의 카운터값: " + counter);
        }
    }

    public static void main(String[] args) {
        new Event01();
    }

}
