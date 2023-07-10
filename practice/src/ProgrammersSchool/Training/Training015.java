package src.ProgrammersSchool.Training;

/**
 * 두 수의 연산값 비교하기
 * 문제 설명
 * 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다.
 * 예를 들면 다음과 같습니다.
 * 12 ⊕ 3 = 123
 * 3 ⊕ 12 = 312
 * 양의 정수 a와 b가 주어졌을 때,
 * a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.
 * 단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.
 * 
 * 제한사항
 * 1 ≤ a, b < 10,000
 * 
 * 입출력 예
 * a b result
 * 2 91 364
 * 91 2 912
 */
public class Training015 {
    public static int solution(int a, int b) {
        String ab = String.valueOf(a) + String.valueOf(b);

        int AB = Integer.parseInt(ab);
        int multi = 2 * a * b;
        int answer = AB > multi ? AB : multi;

        return answer;

        // 1.
        // return Math.max(Integer.parseInt(String.valueOf(a)+String.valueOf(b)),2*a*b);

        // 2.
        // int ab = Integer.parseInt(a + "" + b);
        // if(2 * a * b <= ab) {
        // return ab;
        // } else {
        // return 2 * a * b;
        // }
    }

    public static void main(String[] args) {
        int a = 9;
        int b = 91;
        int result = solution(a, b);
        System.out.println(result);
    }
}
