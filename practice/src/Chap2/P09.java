package src.Chap2;

//비트 이동 연산자 실습하기
public class P09 {
    public static void main(String[] args) {
        int x = 0b00001101;
        int y = 0b00001010;
        System.out.println("x&y=" + (x & y) + "    ");
        System.out.println("x|y=" + (x | y) + "    ");
        System.out.println("x^y=" + (x ^ y) + "    ");
        System.out.println("~x" + (~x) + "    ");
        System.out.println("x>>1=" + (x >> 1) + "    ");
        System.out.println("x<<1=" + (x << 1) + "    ");
        System.out.println("x>>>1=" + (x >>> 1) + "    ");

    }
}
