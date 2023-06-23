package ex08;

public class DivideZero {
    static void Divide(int n) {
        int result = 10 / n;
        System.out.printf("나눗셈 결과 : %s", result);
    }

    public static void main(String[] args) {
        try {
            Divide(0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
