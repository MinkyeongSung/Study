package exam2;

public class JavaCafe {
    public static void main(String[] args) {
        // printPay(10.00, 40);
        // printPay(10.00, 50);
        // printPay(7.50, 38);
        // printPay(8.50, 66);
        printPay(10, 41);
    }

    // 시급과 일한 시간을 입력받아, 주급을 출력
    public static void printPay(double basePay, int hours) {
        // 1.예외처리
        if (basePay < 8) {
            System.out.println("최저 시급 에러");
            return; // return으로 실행종료.
        }
        if (hours < 60) {
            System.out.println("초과근무 시간 에러");
        }

        /* 해당 메소드를 완성하세요. */
        double pay = basePay * hours;
        if (hours > 40)
            pay = pay + (hours - 40) * basePay * 0.5;

        // 기본페이와 추가페이를 따로 작성하여 추가시급만 따로 계산해도 된다.
        System.out.printf("$ %.2f\n", pay);
    }
}
