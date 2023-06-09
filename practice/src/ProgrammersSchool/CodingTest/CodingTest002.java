package src.ProgrammersSchool.CodingTest;

/**
 * 정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.
 * 제한사항
 * -50000 ≤ num1 ≤ 50000
 * -50000 ≤ num2 ≤ 50000
 */
class Solution002 {
    public int solution(int num1, int num2) {
        int answer = 0;
        if (-50000 <= num1 && num1 <= 50000 && -50000 <= num2 && num2 <= 50000) {
            answer = num1 - num2;
        }
        return answer;
    }
}

class CodingTest002 {
    public static void main(String[] args) {
        Solution002 a = new Solution002();
        System.out.println(a.solution(8, 2));
    }
}
