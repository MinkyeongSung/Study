package test.ex001;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Player extends JLabel {
    // 넣을 것
    // 플레이어 위치, 방향, 속도, 상하좌우이동

    // 위치 상태
    private int x;
    private int y;

    // 플레이어의 방향 상태
    private boolean left;
    private boolean right;
    private boolean up;
    private boolean down;

    // 플레이어 속도 상태
    private final int SPEED = 4; // x축
    private final int JUMPSPEED = 4; // ㅛ축

    // 보는 방향따라 이미지
    private ImageIcon playerR, playerL;

    public Player() { // player = new Player(); // add.(player);
        initObject();
        initSetting();
    }

    private void initObject() {
        // 보는 방향 이미지
        playerR = new ImageIcon("image/playerR.png");
        playerL = new ImageIcon("image/playerL.png");
    }

    private void initSetting() {
        // 초기 생성 위치 값
        x = 55;
        y = 535;

        // 생성 위치 고정
        left = false;
        right = false;
        up = false;
        left = false;

        // 오른쪽보고 시작, 크기, 위치 값,
        setIcon(playerR);
        setSize(50, 50);
        setLocation(x, y);
    }

    public void left() {
        System.out.println("left 메서드 실행됨");
        left = true;
        new Thread(() -> {
            while (left) {
                setIcon(playerL);
                x = x - SPEED;
                setLocation(x, y);

                try {
                    Thread.sleep(10); // 0.01초
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public void right() {
        System.out.println("right 메서드 실행됨");
        right = true;
        new Thread(() -> {
            while (right) {
                setIcon(playerR);
                x = x + SPEED;
                setLocation(x, y);

                try {
                    Thread.sleep(10); // 0.01초
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public void up() {
        System.out.println("up 메서드 실행됨");
        up = true;
        new Thread(() -> {
            for (int i = 0; i < 35; i++) {
                y = y - JUMPSPEED;
                setLocation(x, y);
                try {
                    Thread.sleep(10); // 0.01초s
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            up = false;
            down();
        }).start();

    }

    public void down() {
        System.out.println("down 메서드 실행됨");
        down = true;
        new Thread(() -> {
            while (down) {
                y = y + JUMPSPEED;
                setLocation(x, y);
                try {
                    Thread.sleep(10); // 0.01초s
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            down = false;
        }).start();

    }

    // getter, setter
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isLeft() {
        return left;
    }

    public boolean isRight() {
        return right;
    }

    public boolean isUp() {
        return up;
    }

    public boolean isDown() {
        return down;
    }

    public ImageIcon getPlayerR() {
        return playerR;
    }

    public ImageIcon getPlayerL() {
        return playerL;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public void setDown(boolean down) {
        this.down = down;
    }

    public void setPlayerR(ImageIcon playerR) {
        this.playerR = playerR;
    }

    public void setPlayerL(ImageIcon playerL) {
        this.playerL = playerL;
    }

}
