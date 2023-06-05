package exam2;

public class Elevator {
    public static void main(String[] args) {
        // 변수 생성
        int a = 13;
        int b = 7;
        int c = 25;

        // 결과 출력
        System.out.printf("%d층 -> %s 엘레베이터\n", a, guide(a));
        System.out.printf("%d층 -> %s 엘레베이터\n", b, guide(b));
        System.out.printf("%d층 -> %s 엘레베이터\n", c, guide(c));

    }

    /*
     * 메서드의 인수
     * 리턴
     */
    public static String guide(int floor) {

        // 유효성 검사 (예외처리)
        if (floor > 20 || floor < 1)
            return "오류";
        // 리턴값 초기화

        String result = "";

        if (floor >= 1 && floor <= 10)
            result = "저층";
        else if (floor >= 11 && floor <= 20)
            result = "고층";

        return result;

    }
}
