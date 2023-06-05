package src.Chap2;

import java.util.Scanner;

public class P04f {

    public static void main(String[] args) {
        String name;
        int age;
        int year;
        int month;
        int day;
        String city;
        String man;

        Scanner sc = new Scanner(System.in);

        System.out.println("이름을 입력하시오 : ");
        name = sc.nextLine();

        System.out.println("거주지역을 입력하시오 : ");
        city = sc.nextLine();

        System.out.println("성별을 입력하시오 : ");
        man = sc.nextLine();

        System.out.println("나이를 입력하시오 : ");
        age = sc.nextInt();

        System.out.println("출생년도를 입력하시오 : ");
        year = sc.nextInt();

        System.out.println("출생월를 입력하시오 : ");
        month = sc.nextInt();

        System.out.println("출생일를 입력하시오 : ");
        day = sc.nextInt();

        System.out.println(name + "님은 " + city + "에 거주하고 계시는 " + age + "살" + "(" + year + "년 " + month + "월 " + day
                + "일 출생)" + "의 " + man + "입니다");
        sc.close();
    }
}
