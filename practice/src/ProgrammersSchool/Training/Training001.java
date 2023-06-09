package src.ProgrammersSchool.Training;

import java.util.Scanner;

/**
 * 문자열 str이 주어질 때, str을 출력하는 코드를 작성해 보세요.
 * 1 ≤ str의 길이 ≤ 1,000,000
 * str에는 공백이 없으며, 첫째 줄에 한 줄로만 주어집니다.
 */
public class Training001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int a = str.length();

        if (a >= 1 && a <= 1000000) {
            System.out.println(str);
        }

        sc.close();
    }
}
