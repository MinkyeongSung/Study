package ex04;

class Account {
    // 입금 (입금할 금액, 계좌잔액)
    int deposit(int amount, int money) { // 반환타입이 int이므로 void(x). 타입이 맞아야 한다
        int restMoney = money + amount; // void는 리턴값이 없음.
        return restMoney; // 리턴.메서드를 호출한 라인으로 복귀할 때 값을 반환
        // double은 8바이트, int는 4바이트이므로 명시적형변환(다운캐스팅)
    }

    // 출금 (입금할 금액, 계좌잔액)
    int withdraw(int amount, int money) {
        int restMoney = money - amount;
        return restMoney;
    }

    /*
     * // 이체 (보낼 금액(amount), 받는사람잔액(receiverMoney), 보내는사람잔액(senderMoney))
     * // 리턴은 필요없다. 출력만 해보기 (지금 배운걸로는 자바로 2개 리턴 못함. )
     * int transfer(int amount, int hmoney, int imoney) {
     * int receiverMoney =
     * int senderMoney;
     * }
     */

    public static class Meth03 {
        public static void main(String[] args) {
            // 홍길동의 잔액
            int hmoney = 1000;

            // 임꺽정의 잔액
            int imoney = 1000;

            // 홍길동이 입금을 2번하고, 출금 한번하기

            Account haccount = new Account();
            // new하면 static이 아닌 것들(deposit, withdraw)이 뜸. heap에는 이름만 뜸
            // 메서드 호출시 restMoney, amount, money가 스택에 뜸.
            hmoney = haccount.deposit(100, hmoney);
            // 5번라인으로 이동, 실행(스택생성, amount 100 money 1000 restMoney 1100)
            // 22번라인의 끝으로 복귀하면서 return값인 restMoney 1100을 가져옴
            System.out.println("홍길동 남은 금액 : " + hmoney);

            hmoney = haccount.deposit(500, hmoney);
            System.out.println("홍길동 남은 금액 : " + hmoney);

            hmoney = haccount.withdraw(300, hmoney);
            System.out.println("홍길동 남은 금액 : " + hmoney);

            // 임꺽정이 입금을 1번(100원)하고, 출금 2번(300, 500)하기
            Account iaccount = new Account(); // heap의 공간이 2개. (홍,임)
            imoney = iaccount.deposit(100, imoney);
            System.out.println("임꺽정 남은 금액 : " + imoney);

            imoney = iaccount.withdraw(300, imoney);
            System.out.println("임꺽정 남은 금액 : " + imoney);

            imoney = iaccount.withdraw(500, imoney);
            System.out.println("임꺽정 남은 금액 : " + imoney);

            /*
             * // 이체
             * Account hiaccount = new Account();
             * allmoney =
             */
        }
    }
}