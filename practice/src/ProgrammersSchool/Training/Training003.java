package src.ProgrammersSchool.Training;

import java.util.Scanner;

/**
 * 문자열 str과 정수 n이 주어집니다.
 * str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.
 * 1 ≤ str의 길이 ≤ 10
 * 1 ≤ n ≤ 5
 */
public class Training003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int length = str.length();
        int n = sc.nextInt();
        if (1 <= n && n <= 5 && 1 <= length && length <= 10) {
            for (int i = 1; i <= n; i++) {
                System.out.printf(str);
            }
        }
        sc.close();
    }
}
