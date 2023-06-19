import java.util.Scanner;

public class App {
    private static final int GROUND_HEIGHT = 10; // 지면의 높이
    private static final int MARIO_POSITION = 1; // 마리오의 초기 위치
    private static final int OBSTACLE_POSITION = 6; // 장애물의 초기 위치

    private static int marioPosition = MARIO_POSITION; // 마리오의 현재 위치
    private static int obstaclePosition = OBSTACLE_POSITION; // 장애물의 현재 위치

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            drawGame(); // 게임 상태 그리기

            System.out.print("왼쪽(a) 또는 오른쪽(d)으로 이동: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("a")) {
                moveMarioLeft();
            } else if (input.equalsIgnoreCase("d")) {
                moveMarioRight();
            }

            if (isCollision()) {
                System.out.println("게임 오버!");
                break;
            }

            obstaclePosition--;

            if (obstaclePosition == 0) {
                obstaclePosition = GROUND_HEIGHT;
            }
        }

        scanner.close();
    }

    private static void drawGame() {
        for (int i = 0; i < GROUND_HEIGHT; i++) {
            if (i == marioPosition - 1) {
                System.out.print("M");
            } else if (i == obstaclePosition - 1) {
                System.out.print("X");
            } else {
                System.out.print("_");
            }
        }
        System.out.println();
    }

    private static void moveMarioLeft() {
        if (marioPosition > 1) {
            marioPosition--;
        }
    }

    private static void moveMarioRight() {
        if (marioPosition < GROUND_HEIGHT) {
            marioPosition++;
        }
    }

    private static boolean isCollision() {
        return marioPosition == obstaclePosition;
    }
}