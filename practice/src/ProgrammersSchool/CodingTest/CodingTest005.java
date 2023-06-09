package src.ProgrammersSchool.CodingTest;

/**
 * 정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록
 * soltuion 함수를 완성해주세요.
 * 제한사항
 * 0 < num1 ≤ 100
 * 0 < num2 ≤ 100
 */

class Solution005 {
    public int solution(int num1, int num2) {
        int answer = 0;
        if (0 < num1 && num1 <= 100 && 0 < num2 && num2 <= 100) {
            answer = 1000 * num1 / num2;
        }
        return answer;
    }
}

public class CodingTest005 {
    public static void main(String[] args) {
        Solution005 a = new Solution005();
        System.out.println(a.solution(4, 2));
    }
}
