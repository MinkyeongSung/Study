package src.ProgrammersSchool.Training;

/**
 * 길이가 같은 두 문자열 str1과 str2가 주어집니다.
 * 두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어
 * return 하는 solution 함수를 완성해 주세요.
 * 제한사항
 * 1 ≤ str1의 길이 = str2의 길이 ≤ 10
 * str1과 str2는 알파벳 소문자로 이루어진 문자열입니다.
 * 입출력 예
 * str1 str2 result
 * "aaaaa" "bbbbb" "ababababab"
 */

class Solution011 {
    public static String solution(String str1, String str2) {
        String answer = "";

        // split("")을 이용해 각 문자마다 분할
        String[] str1arr = str1.split("");
        String[] str2arr = str2.split("");
        for (int i = 0; i < str1.length(); i++) {
            // str1과 str2의 문자열을 번갈아 가면서 저장
            answer += str1arr[i] + str2arr[i];

            // for(int i = 0; i < str1.length(); i++){
            // answer+= str1.charAt(i);
            // answer+= str2.charAt(i);
            // }
        }
        return answer;
    }

    public static void main(String[] args) {
        String str1 = "ace";
        String str2 = "bdfg";
        String ResultString = solution(str1, str2);
        System.out.println(ResultString); // 출력: adbecfg
    }
}
/*
 * public class Training011 {
 * public static String solution011(String str1, String str2) {
 * StringBuilder result = new StringBuilder();
 * int StrLength = Math.max(str1.length(), str2.length());
 * 
 * for (int i = 0; i < StrLength; i++) {
 * if (i < str1.length()) {
 * result.append(str1.charAt(i));
 * }
 * if (i < str2.length()) {
 * result.append(str2.charAt(i));
 * }
 * }
 * 
 * return result.toString();
 * }
 * 
 * public static void main(String[] args) {
 * String str1 = "ace";
 * String str2 = "bdfg";
 * String ResultString = solution011(str1, str2);
 * System.out.println(ResultString); // 출력: adbecfg
 * }
 * }
 */