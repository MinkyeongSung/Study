package ex08;

public class DivideZero2 {

    static void Divide(int n) {
        try {

            int result = 10 / n;
            System.out.printf("나눗셈 결과 : %s", result);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

    }
}
