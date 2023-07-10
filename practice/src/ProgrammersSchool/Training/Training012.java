package src.ProgrammersSchool.Training;

/**
 * 문자들이 담겨있는 배열 arr가 주어집니다.
 * arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.
 * 제한사항
 * 1 ≤ arr의 길이 ≤ 200
 * arr의 원소는 전부 알파벳 소문자로 이루어진 길이가 1인 문자열입니다.
 * 입출력 예
 * arr result
 * ["a","b","c"] "abc"
 */
public class Training012 {
    public static String solution(String[] arr) {
        // return String.join("", arr);

        String answer = "";

        // String a : arr for-each문 활용.
        // 배열 arr의 각 요소를 순차적으로 가져와서 변수 a에 할당
        for (String a : arr) {
            answer += a;
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] arr = { "a", "b", "c" };
        String result = solution(arr);
        System.out.println(result);
    }
}