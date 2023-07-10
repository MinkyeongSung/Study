package src.ProgrammersSchool.Training;

/**
 * 문자열 my_string과 정수 k가 주어질 때,
 * my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.
 * 제한사항
 * 1 ≤ my_string의 길이 ≤ 100
 * my_string은 영소문자로만 이루어져 있습니다.
 * 1 ≤ k ≤ 100
 * 입출력 예
 * my_string k result
 * "string" 3 "stringstringstring"
 * "love" 10 "lovelovelovelovelovelovelovelovelovelove"
 */
public class Training013 {
    public static String solution(String my_string, int k) {
        String answer = "";

        for (int i = 1; i <= k; i++) {
            answer += my_string;
        }

        return answer;

        /*
         * StringBuilder sb = new StringBuilder();
         * for (int i=0; i<k; i++) {
         * sb.append(my_string);
         * }
         * return sb.toString();
         * }
         */
    }

    public static void main(String[] args) {
        String my_String = ("hello");
        String result = solution(my_String, 3);
        System.out.println(result);
    }
}
