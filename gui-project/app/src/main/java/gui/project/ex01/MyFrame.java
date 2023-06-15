package gui.project.ex01;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class MyFrame extends JFrame {

    public MyFrame() {
        super.setSize(300, 500);
        setTitle("myFrame");

        this.setLayout(new FlowLayout());

        JButton button1 = new JButton("버튼");
        this.add(button1);

        JButton button2 = new JButton("버튼");
        this.add(button2);

        JButton button3 = new JButton("버튼");
        this.add(button3);

        setVisible(true); // 항상 마지막에
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MyFrame(); // 받아서 하는게 아니라서 Myframe f = new MyFrame();으로 할 필요 x
    }
}
