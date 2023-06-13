package src.ProgrammersSchool.Training;

import java.util.Scanner;

/**
 * 두 정수 a, b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요.
 * 제한사항
 * 1 ≤ a, b ≤ 100
 */

public class Training006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (1 <= a && b <= 100)
            System.out.printf("%d + %d = % d", a, b, a + b);

        sc.close();
    }

}
