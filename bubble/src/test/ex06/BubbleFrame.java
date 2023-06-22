package test.ex06;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

// main 스레드를 GUI 프로그램에서는 ui 스레드라고 부른다.
//클릭하는 순간 소비되기전에 이벤트 루프에 등록부터 되고 먼저 등록된 것부터 실행
//소비되는 시점은 메인스레드가 안 바쁠때
public class BubbleFrame extends JFrame {

    private JLabel backgroundMap;
    private Player player;

    public BubbleFrame() {
        initObject();
        initSetting();
        initListener();
        setVisible(true); // while
    }

    private void initObject() {
        backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));
        setContentPane(backgroundMap);
        player = new Player();
        add(player);
    }

    private void initSetting() {
        setSize(1000, 640);
        setLayout(null); // absoulte 레이아웃 (자유롭게 그림을 그릴 수 있다)
        setLocationRelativeTo(null); // JFrame 가운데 배치하기
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼으로 창을 끌 때 JVM 같이 종료하기
    }

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

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    player.setLeft(false);
                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    player.setRight(false);
                } else if (e.getKeyCode() == KeyEvent.VK_UP) {
                    player.setUp(false);
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    player.setDown(false);
                }
            }
        });
    }

    public static void main(String[] args) {
        new BubbleFrame();
    }
}