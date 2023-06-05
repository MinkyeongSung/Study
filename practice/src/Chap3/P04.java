package src.Chap3;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        // while문
        // 어떤 조건을 정해놓고 반복을 하는 구조.
        int k = 0;
        while (k < 5) {
            System.out.println("환영합니다!");
            k++;
        }
        System.out.println("반복이 종료되었습니다.");

        // while문 2번째
        Scanner sc = new Scanner(System.in);
        int sum = 0, value = 0;

        while (value != -1) {
            sum = sum + value;
            System.out.println("정수를 입력하시오: ");
            value = sc.nextInt();
        }
        System.out.println("정수의 합은 " + sum + "입니다.");

        // do-while문
        // 반복 조건을 루프의 처음이 아니라 루프의 끝에서 검사하는 것이 차이점.
        int month;
        do {
            System.out.println("올바른 월을 입력하시오 [1-12]");
            month = sc.nextInt();
        } while (month < 1 || month > 12);
        System.out.println("사용자가 입력한 월은 " + month);

        // 중첩 반복문
        // 반복문 안에 다른 반복문.
        // 각각의 반복문을 제어하는 변수가 달라야 한다.
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 10; x++)
                System.out.println("*");
        }
        System.out.println("");

        // break문.
        // 반복문을 벗어날 때 사용한다.
        for (

                int i = 1; i < 6; i++) { // 6보다 작을때 1씩 추가
            if (i == 4) // 4가되면?
                break; // 멈춤. 그래서 3까지 출력
            System.out.println(i); // 1일때, 2일때, 3일때까지. break가 위에 있으므로 4는 출력X
        }

        // continue문
        // 반복문에서 현재의 반복을 건너뛰어서 다음 반복으로 넘어가게 함.
        for (int j = 1; j < 6; j++) { // 6보다 작을 때 1씩 추가
            if (j == 4)
                continue; // 4일때 건너뜀
            System.out.println(j);
        }

        // 점수 평균 구하기
        int total = 0, count = 0;
        while (true) {
            System.out.println("점수를 입력하시오: ");
            int grade = sc.nextInt();
            if (grade < 0)
                break;
            total += grade;
            count++;
        }
        System.err.println("평균은 " + total / count);

        sc.close();
    }

}
