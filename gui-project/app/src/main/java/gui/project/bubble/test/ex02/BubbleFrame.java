package gui.project.bubble.test.ex02;

import javax.swing.*;

public class BubbleFrame extends JFrame {

    private JLabel backgroundMap;
    private Player player;

    public BubbleFrame() {

        backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));
        setContentPane(backgroundMap);

        setSize(1000, 640);
        setLayout(null); // absoulte 레이아웃 (자유롭게 배추 가능)
        setLocationRelativeTo(null); // (JFrame 가운데 배치하기)
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);
    }

    public static void main(String[] args) {
        new BubbleFrame();
    }
}
