package exam2;

public class Walking {
    public static void main(String[] args) {
        /* 1. 칼로리 계산을 위해 메소드를 호출하시오. */
        double result = calculateCalory(5000);
        /* 3. 결과를 출력하시오. */
        System.out.println(result);
    }

    /* 2. 칼로리 계산 메소드를 정의하시오. */
    private static double calculateCalory(int walk) {
        return 0.02 * walk; // 리턴타입와 메소드 타입은 같아야 한다. (double)
        // int 타입으로 하면 0.02은 0이 되기 때문에 계산값 0이 됨.
        // sout(int) (0.02 * 5000)
    }
}
