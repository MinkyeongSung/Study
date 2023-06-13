package src.ProgrammersSchool.Training;

/**
 * 문자열 my_string, overwrite_string과 정수 s가 주어집니다.
 * 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을
 * 문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
 * 제한사항
 * my_string와 overwrite_string은 숫자와 알파벳으로 이루어져 있습니다.
 * 1 ≤ overwrite_string의 길이 ≤ my_string의 길이 ≤ 1,000
 * 0 ≤ s ≤ my_string의 길이 - overwrite_string의 길이
 */
class Solution010 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0, s) + overwrite_string
                + my_string.substring(s + overwrite_string.length());
        return answer;
    }
}
// .substring(n1,n2)은 문자열의 n1번째부터 시작하여 n2번째까지 출력한다.
// 예시) Hello를 .substring(n2,n4)에 적용하면 ll

public class Training010 {
    public static void main(String[] args) {
        Solution010 a = new Solution010();
        String result = a.solution("He11oWor1d", "lloWorl", 2);
        System.out.println(result);
    }
}
