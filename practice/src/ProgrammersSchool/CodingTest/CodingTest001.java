package src.ProgrammersSchool.CodingTest;

/**
 * 정수 num1과 num2가 주어질 때, num1과 num2의 합을 return하도록 soltuion 함수를 완성해주세요.
 * 제한사항
 * -50,000 ≤ num1 ≤ 50,000
 * -50,000 ≤ num2 ≤ 50,000
 */
class Solution001 {
    public int solution(int num1, int num2) {
        int answer = 0;
        if (-50000 <= num1 && num1 <= 50000 && -50000 <= num2 && num2 <= 50000) {
            answer = num1 + num2;
        }
        return answer;
    }
}

public class CodingTest001 {

    public static void main(String[] args) {
        Solution001 a = new Solution001();
        System.out.println(a.solution(2, 1));
    }
}
