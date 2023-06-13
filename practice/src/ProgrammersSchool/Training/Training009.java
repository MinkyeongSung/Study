package src.ProgrammersSchool.Training;

import java.util.Scanner;

/**
 * 자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을,
 * 홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.
 * 제한사항
 * 1 ≤ n ≤ 1,000
 */
public class Training009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (1 <= n && n <= 1000) {
            if (n % 2 == 0) {
                System.out.printf("%d is even\n", n);
            }
            if (n % 2 != 0) {
                System.out.printf("%d is odd\n", n);
            }
        }
        sc.close();
    }
}