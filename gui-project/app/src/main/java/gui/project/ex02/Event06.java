package gui.project.ex02;

import java.awt.BorderLayout;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Event06 extends MyFrame {

    private JButton btn1, btn2;

    public Event06() {
        super(300, 150);

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

            Object target = e.getSource();
            JButton btn = (JButton) target;

            System.out.println(btn.getText());
            System.out.println(btn.getX());
            System.out.println(btn.getY());
            System.out.println(btn.getHeight());
            System.out.println(btn.getWidth());

            // 이벤트가 처리될 동적 분기
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

    }

    public static void main(String[] args) {
        new Event06();

    }

}
