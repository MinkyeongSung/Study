package gui.project.ex02;

import javax.swing.*;
import java.awt.event.*;

public class Event03 extends JFrame implements ActionListener {
    // 클래스 안에 actionperformed()가 정의되어 있어야 한다.
    private JButton button;
    private JLabel label;
    int counter = 0;

    public void actionPerformed(ActionEvent e) {
        counter++;
        label.setText("현재의 카운터값: " + counter);
    }

    public Event03() {
        this.setSize(400, 150);
        this.setTitle("이벤트 예제");

        JPanel panel = new JPanel();
        button = new JButton("증가");
        label = new JLabel("현재의 카운터값: " + counter);

        button.addActionListener(this);
        // 현재 객체를 이벤트 리스너로 버튼에 등록한다. 즉, 자기 자신이 이벤트를 처리한다고 등록한다.

        panel.add(label);
        panel.add(button);
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Event03();
    }
}
