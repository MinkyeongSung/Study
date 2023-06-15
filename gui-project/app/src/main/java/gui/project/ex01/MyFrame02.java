package gui.project.ex01;

/**
 * JFrame 컨테이너의 배경색을 노랑색으로 변경하고 버튼을 2개 추가하기
 */
import javax.swing.*;
import java.awt.*;

public class MyFrame02 extends JFrame {
    public MyFrame02() {
        setSize(300, 150); // 크기
        setLocation(200, 300); // 위치
        setTitle("Myframe02");
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.yellow); // 배경색 변경
        JButton button1 = new JButton("확인");
        JButton button2 = new JButton("취소");
        this.add(button1);
        this.add(button2);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MyFrame02();
    }
}
