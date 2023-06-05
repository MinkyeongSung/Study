package src.Chap2;

import java.util.Scanner;

/* 섭씨 -화씨 온도 변환
섭씨 온도와 화씨 온도는 다음과 같은 수식을 만족한다.
C=5/9(F-32)
1. 사용자로부터 화씨 온도를 받아서 섭씨 온도로 환산하여 출력하는 프로그램을 작성하시오.
2. 사용자로부터 섭씨 ~"
3. 2가지의 변환 중 하나를 사용자가 선택하게 하라. 조건 연산자를 사용해보자

=============================
1. 화씨 -> 섭씨
2. 섭씨 -> 화씨
=============================
번호를 선택하시오 : 1
화씨온도를 입력하시오 : 100.0
섭씨온도는 37.7777777777777778
*/

public class MiniProject01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("화씨온도를 입력하시오: ");
        double hasi = sc.nextInt();
        double subsi = (5.0 / 9.0) * (hasi - 32);
        System.out.println("섭씨온도는 " + subsi);
        sc.close();
    }
}

/*
 * ??????????
 * int num;
 * double f;
 * double c;
 * 
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.println("번호를 선택하시오 : ");
 * num = sc.nextInt();
 * 
 * (num != 0) ? f : c;
 * 
 * f = sc.nextDouble();
 * c = sc.nextDouble();
 * 
 * System.out.println("섭씨 온도는 "+c);
 * 
 * System.out.println("화씨 온도는 "+f);
 * sc.close();
 */