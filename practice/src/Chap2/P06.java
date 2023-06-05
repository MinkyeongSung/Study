package src.Chap2;

// 증감,복합 대입 연산자
public class P06 {
    public static void main(String[] args) {
        int x = 1, y = 1;

        int a = x++; // x의 값이 사용 되기 전에 추가. (a=1)
        int b = ++y; // y의 값이 사용 된 후에 추가. (b=2)
        System.out.println("a=" + a + ", b=" + b);

        int c = 100, d = 200;
        c += 10; // c = c + 10
        d /= 10; // d = d / 10
        System.out.println("c=" + c + ", d=" + d);

    }
}
