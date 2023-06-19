package gui.project.ex02;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Event09 extends JFrame {

    private JButton btn1, btn2;

    public Event09() {
        // 1. 컴포넌트 생성
        btn1 = new JButton("버튼1");
        btn2 = new JButton("버튼2");

        // 2. 컴포넌트를 컨테이너에 배치
        add(btn1, BorderLayout.NORTH);
        add(btn1, BorderLayout.SOUTH);

        // 3. 리스터 생성
        Callback call = new Callback(); // 콜백 타겟 가이드
        btn1.addActionListener(null);
        btn2.addActionListener(null);

        // 4. 그림 그리기
        setVisible(true);

    }

    class Callback implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }

    }

    public static void main(String[] args) {
        new Event09();
    }

}
