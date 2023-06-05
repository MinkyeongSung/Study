package src.Chap3;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        // 정수의 합 계산하기
        int sum = 0;

        for (int i = 1; i <= 10; i++)
            sum += i;

        System.out.println("1부터 10까지의 정수의 합 =" + sum);

        // 팩토리얼 계산하기
        long fact = 1; // 팩토리얼의 값은 생각보다 아주 커질 수 있어서 png으로 선언. 초기값은 반드시 1. 곱셈식이라 0 안됨
        int n;

        System.out.println("정수를 입력하시오:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <= n; i++)
            fact = fact * i;

        System.out.printf("%d!은 %d입니다\n", n, fact);

        // 약수 계산하기.
        // 양의 정수 입력받고 모든 약수 출력

        System.out.println("양의 정수를 입력하시오: ");
        int m = sc.nextInt();

        System.out.println(n + "의 약수는 다음과 같습니다.");
        for (int j = 1; j <= m; ++j) {
            if (m % j == 0)
                System.out.println(" " + j);
        }

        sc.close();

    }
}
