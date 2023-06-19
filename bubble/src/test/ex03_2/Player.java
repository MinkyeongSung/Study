package test.ex03_2;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel {

    private int x;
    private int y;

    private ImageIcon playerR, playerL;

    public Player() {
        // 오브젝트 만들고 세팅.
        initObject();
        IninSetting();
    }

    private void initObject() {
        playerR = new ImageIcon("image/playerR.png");
        playerL = new ImageIcon("image/playerL.png");
    }

    private void IninSetting() {
        x = 55;
        y = 535;

        setIcon(playerR);
        setSize(50, 50);
        setLocation(x, y);

    }

    public void right() {
        setIcon(playerR);

        while (true) {

            x = x + 10;
            setLocation(x, y);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (x > 200) {
                break;
            }
        }

    }

    public void left() {
        setIcon(playerL);
        x = x - 10;
        setLocation(x, y);

    }

}
