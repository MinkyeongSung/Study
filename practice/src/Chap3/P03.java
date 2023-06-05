package src.Chap3;

import java.util.Scanner;

//가위바위보
public class P03 {
    final int SCISSOR = 0; // final은 상수. 변경불가능
    final int ROCK = 1;
    final int PAPER = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("가뷔(0), 바위(1), 보(2)");
        int user = sc.nextInt();

        int com = (int) (Math.random() * 3);
        if (user == com)
            System.out.println("무승부");

        else if (user == (com + 1) % 3)
            System.out.println("인간" + user + " 컴" + com + " 인간 승리");

        else
            System.out.println("인간" + user + " 컴" + com + " 컴 승리");
        sc.close();

    }
}
