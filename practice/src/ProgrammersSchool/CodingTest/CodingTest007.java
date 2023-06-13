package src.ProgrammersSchool.CodingTest;

import java.util.Arrays;

/**
 * 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1,
 * 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
 * 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록
 * solution 함수를 완성해보세요.
 * 제한사항
 * 0 <numer1, denom1, numer2, denom2 < 1,000
 */
class Solution007 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer3 = ((numer1 * denom2) + (numer2 * denom1)); // 분자
        int denom3 = (denom1 * denom2); // 분모
        int num = find(numer3, denom3); // 최대공약수 찾기

        int[] answer = { numer3 / num, denom3 / num };
        return answer;
    }

    // 최대공약수를 구하는 메서드
    private int find(int a, int b) {
        if (b == 0) {
            return a;
        }
        return find(b, a % b);
    }

}

public class CodingTest007 {
    public static void main(String[] args) {
        Solution007 a = new Solution007();
        int[] result = a.solution(1, 2, 3, 4);
        System.out.println(Arrays.toString(result)); // 출력. Arrays를 사용하기 위해 임포트(import java.util.Arrays;)
    }
}
