package src.Chap3;

import java.util.Scanner;

public class HomeCoin {
    public static void main(String[] args) {
        // 500, 100, 50, 10 (개수를 최소로 해서 주세요.)
        Scanner scanner = new Scanner(System.in);
        System.out.print("금액을 입력하세요: ");
        int money = scanner.nextInt();
        int[] coins = { 500, 100, 50, 10 }; // 동전의 종류
        int[] counts = new int[coins.length]; // 동전 개수를 담을 배열

        int restMoney = money; // 남은 금액 변수 만들기

        for (int i = 0; i < coins.length; i++) {
            counts[i] = restMoney / coins[i]; // 해당 동전의 개수 계산
            restMoney = restMoney % coins[i]; // 남은 금액 업데이트
            System.out.println(coins[i] + "원 : " + counts[i]);

        }
        scanner.close();
    }
}
// 파스칼 안지킴