package src.Chap4;
/*
 * 어떤 게임이 있다. 이 게임은 주사위를 먼저 나오는 눈의 수 만큼 달러를 획득한다.
 * 주사위를 총 3번 먼저 얻은 달러. 이를 환전한 결과를 출력하시오.
 * 
 * 요구사항
 * Math.random() 1과 6사이의 숫자를 반환하는 dice() 메소드를 구현 할 것
 * 1달러의 환율은 1082.25108 원으로 한다.
 * 
 * 예시) 획득 금액 : $12.00(12987원)
 */

public class Gamble {
    public static void main(String[] args) {
        double dollor = dice() + dice() + dice();
        double won = exchange(dollor);
        System.out.printf("획득 금액: $%.2f(%.0f원)", dollor, won);

    }

    public static int dice() {
        int dice = (int) (Math.random() * 6) + 1;
        return dice;
    }

    public static double exchange(double dollor) {
        double won = (double) dollor * 1082.25108;
        return won;
    }
}
