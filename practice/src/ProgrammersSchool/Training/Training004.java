package src.ProgrammersSchool.Training;

import java.util.Scanner;

/*
 * 영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
제한사항 : 1 ≤ str의 길이 ≤ 20 str은 알파벳으로 이루어진 문자열입니다.
입력 : aBcDeFg  출력 : AbCdEfG
 */
public class Training004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next(); // 문자열을 받음.
        char[] ch = a.toCharArray(); // 문자열을 char로 변환
        for (int i = 0; i < ch.length; i++) { // 문자열의 길이만큼 반복
            if (97 <= (int) ch[i] && (int) ch[i] <= 122) { // 아스키코드 소문자(97~122)
                char convert = (char) (ch[i] - 32); // 를 대문자로(-32) 후 char로 변환
                System.out.print(convert);
            }

            if (65 <= (int) ch[i] && (int) ch[i] <= 90) { // 아스키코드 대문자(65~90)
                char convert = (char) (ch[i] + 32); // 소문자 (+32) ~"
                System.out.print(convert);
            }
        }
        sc.close();
    }
}