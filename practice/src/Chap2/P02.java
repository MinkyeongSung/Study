package src.Chap2;

/* 콘솔에서 입력받기 실행결과
 첫 번째 숫자를 입력하시오 : 10
 두 번째 숫자를 입력하시오 : 20
 두 숫자의 합 : 30
 */

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, sum;

        System.out.println("첫 번째 숫자를 입력하시오 :");
        x = sc.nextInt();

        System.out.println("두 번째 숫자를 입력하시오 :");
        y = sc.nextInt();

        sum = x + y;
        System.out.println("두 숫자의 합 : " + sum);
        sc.close();
    }
}