package test.ex001;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BubbleFrame extends JFrame {
    // 넣을 것
    // 맵, 플레이어, 이벤트
    private JLabel backgroundmap;
    private Player player;

    public BubbleFrame() {
        initObject();
        initSetting();
        initListener();
        setVisible(true);
    }

    private void initObject() {
        // 맵
        backgroundmap = new JLabel(new ImageIcon("./image/backgroundMap.png"));
        setContentPane(backgroundmap);
        // 플레이어 - Player.java에서 세팅
        player = new Player();
        add(player);

    }

    private void initSetting() {
        setSize(1000, 640); // 창크기
        setLayout(null); // 자유롭게 그리기
        setLocationRelativeTo(null); // 가운데 배치
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창끄기
    }

    // 이벤트
    private void initListener() {
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // System.out.println(e.getKeyCode());

                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    if (!player.isLeft()) {
                        player.left();
                    }
                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    if (!player.isRight()) {
                        player.right();
                    }

                } else if (e.getKeyCode() == KeyEvent.VK_UP) {
                    if (!player.isUp() && !player.isDown()) { // if (!player.isUp() && !player.isDown()) {
                        player.up();
                    }
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    if (!player.isDown()) {
                        player.down();
                    }
                }

            }
        });
    }

    private void setVisible() {

    }

    public static void main(String[] args) {
        new BubbleFrame();
    }
}
