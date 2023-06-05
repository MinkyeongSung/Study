package src.Chap2;

import java.util.Scanner;

public class MiniProject02 {
    public static void main(String[] args) {
        // 하나의 상자에 오랜지 10개. 127개있다면 상자 몇개? 또 오렌지 몇개 남음?
        int orange;
        int box;
        int a;

        Scanner sc = new Scanner(System.in);
        System.out.println("오렌지 갯수 : ");
        orange = sc.nextInt();

        a = orange % 10;
        box = orange / 10;

        System.out.println("상자 수 : " + box + "남은 오렌지 : " + a);

        // 마일을 킬로미터로 변환하는프로그램. 1마일은 1.609킬로미터와 같다.
        double mile;
        double kilo;

        System.out.println("마일을 입력하시오 : ");
        mile = sc.nextDouble();
        kilo = mile * 1.609;

        System.out.println(mile + "마일은 " + kilo + "킬로미터입니다.");

        // 사용자로부터 두 개의 정수를 받아서 정수의 합, 차, 곱, 평균, 큰수, 작은 수 계산
        int b;
        int c;
        int sum;
        int sub;
        int gob;
        int avg;
        int max;
        int min;

        System.out.println("첫 번째 수를 입력 : ");
        b = sc.nextInt();
        System.out.println("두 번쨰 정수를 입력 :");
        c = sc.nextInt();

        sum = b + c;
        sub = b - c;
        gob = b * c;
        avg = sum / 2; // 입력받은 수를 카운트 하는 건 없나?
        max = (b > c) ? b : c;
        min = (b < c) ? b : c;
        System.out.println("합 " + sum + " 차" + sub + " 곱" + gob + " 평균" + avg + " 큰수" + max + " 작은 수" + min);

        // P와 Q를 사용해서 자바의 기본 논리 연산에 대한 진리표를 다음과 같이 표시
        System.out.println("P\t" + "Q\t" + "AND\t" + "OR\t" + "XOR");
        System.out.print("아직 내용 안넣음");
        sc.close();
    }
}
