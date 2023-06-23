package test.ex03_2;

import javax.swing.*;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BubbleFrame extends JFrame {

    private JLabel backgroundMap;
    private Player player;

    public BubbleFrame() {
        initObject();
        IninSetting();
        initListener();
        setVisible(true);
    }

    private void initObject() {
        backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png")); // 7
        player = new Player();

        setContentPane(backgroundMap);
        add(player);

    }

    private void IninSetting() {
        setSize(1000, 640);
        setLayout(null); // absoulte 레이아웃 (자유롭게 배추 가능)
        setLocationRelativeTo(null); // (JFrame 가운데 배치하기)
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void initListener() {
        // 키보드 이벤트는 버튼이 아니라 화면전체(JFrame)에 이벤트를 넣어야 한다.
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                System.out.println(e.getKeyCode());

                if (e.getKeyCode() == 39) { // KeyEvent.VK_RIGHT 스테이틱 변수
                    player.right();
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) { // 37
                    player.left();
                }
            }
        });
    }

    public static void main(String[] args) { // 2
        new BubbleFrame(); // 3
    }

}
