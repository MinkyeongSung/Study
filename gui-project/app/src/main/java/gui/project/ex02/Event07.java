package gui.project.ex02;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Event07 extends JFrame implements ActionListener {

    private JButton btn1, btn2;

    public Event07() {
        // 1. 컴포넌트 생성
        btn1 = new JButton("버튼1");
        btn2 = new JButton("버튼2");

        // 2. 컴포넌트를 컨테이너에 배치
        add(btn1, BorderLayout.NORTH);
        add(btn1, BorderLayout.SOUTH);

        // 3. 리스터 생성
        btn1.addActionListener(this);
        btn2.addActionListener(this);

        // 4. 그림 그리기
        setVisible(true);

    }

    class Callback implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    // 비추
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();

        if (btn.getText().equals("버튼1")) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            System.out.println("버튼 1이 클릭 되었습니다.");
        } else if (btn.getText().equals("버튼2")) {
            System.out.println("버튼 2가 클릭 되었습니다.");
        }

    }

    public static void main(String[] args) {
        new Event07();
    }

}
