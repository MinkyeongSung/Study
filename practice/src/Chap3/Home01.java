package src.Chap3;

public class Home01 {
    public static void main(String[] args) {
        // 500, 100, 50, 10(개수를 최소로 해서 주세요)
        final int money = 2680; // scanner로 수정하기 , 상수임
        int restmoney = money; // 남은 금액 변수 만들기
        int count; // 동전 개수를 담을 변수

        int tempmoney;

        tempmoney = 500;
        count = restmoney / tempmoney; // 5
        System.out.println(tempmoney + "원 :" + count);
        restmoney = restmoney - tempmoney * count; // restmoney%500

        tempmoney = 100;
        count = restmoney / tempmoney; // 26
        System.out.println(tempmoney + "원 :" + count);
        restmoney = restmoney - tempmoney * count;

        tempmoney = 50;
        count = restmoney / tempmoney;
        System.out.println(tempmoney + "원 :" + count);
        restmoney = restmoney - tempmoney * count;

        tempmoney = 10;
        count = restmoney / tempmoney;
        System.out.println(tempmoney + "원 :" + count);
        restmoney = restmoney - tempmoney * count;

        // 일관성 있게. -로 했으면 -로, %로 했으면 %로.
        // 이렇게 작성해 놓아야 리팩토링이 가능 (코드 줄이는 작업)
        // 배열이랑 for문으로 temp~이하 코드를 4줄로 줄여버리기가 숙제
    }
}
// ctrl c만 할 수 있게. 동일한 코드