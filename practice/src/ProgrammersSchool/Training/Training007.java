package src.ProgrammersSchool.Training;

import java.util.Scanner;

/**
 * 두 개의 문자열 str1, str2가 공백으로 구분되어 입력으로 주어집니다.
 * str1과 str2을 이어서 출력하는 코드를 작성해 보세요.
 * 제한사항
 * 1 ≤ str1, str2의 길이 ≤ 10
 * 
 */
public class Training007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        if (1 <= a.length() && b.length() <= 10) {
            System.out.printf("%s%s", a, b);
        }
        sc.close();
    }
}