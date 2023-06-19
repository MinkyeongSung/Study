package gui.project.ex02;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Event08 extends JFrame {

    private JButton btn1, btn2;

    public Event08() {
        btn1 = new JButton("버튼1");
        btn2 = new JButton("버튼2");

        add(btn1, BorderLayout.NORTH);
        add(btn1, BorderLayout.SOUTH);

        btn1.addActionListener(null);
        btn2.addActionListener(null);

        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("버튼1이 실행되었습니다.");
            }
        });
        btn2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("버튼2가 실행되었습니다.");
            }

        });

        // 4. 그림 그리기
        setVisible(true);

    }

    class Callback implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }

    }

    public static void main(String[] args) {
        new Event08();
    }

}
