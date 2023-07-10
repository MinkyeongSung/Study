package src.ProgrammersSchool.Training;

/**
 * 12 ⊕ 3 = 123
 * 3 ⊕ 12 = 312
 * 양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중
 * 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
 * 단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.
 * 
 * 제한사항
 * 1 ≤ a, b < 10,000
 * 
 * 입출력 예
 * a b result
 * 9 91 991
 * 89 8 898
 */
public class Training014 {
    public static int solution(int a, int b) {
        // a,b를 문자열로 바꿔서 순서대로 저장
        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);

        // 문자열로 바꾼 ab를 정수로 저장
        int AB = Integer.parseInt(ab);
        int BA = Integer.parseInt(ba);

        return Math.max(AB, BA);

        // int answer = 0;
        // // 빈 문자열과 정수 a를 연결한 후, 그 결과에 b를 이어붙이는 연산이 수행
        // int aLong = Integer.parseInt("" + a + b);
        // int bLong = Integer.parseInt(b + "" + a);
        // answer = aLong > bLong ? aLong : bLong;

        // return answer;

    }

    public static void main(String[] args) {
        int a1 = 9;
        int b1 = 91;
        int result1 = solution(a1, b1);
        System.out.println(result1);
    }
}
