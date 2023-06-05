/*날짜를 입력 받고 2023-05-26
 * String Date = sc.nextLine();
 * 변경할 년 월 일 중 입력 받고 year, month, day
 * String Type = sc.nextLine();
 * 숫자 입력 받고 3
 * 
 * 예시
 * 2023-05-26
 * month
 * 3
 * 결과
 * 2023-08-26
 */

package src.Chap3;

import java.util.Scanner;

public class Teacher01 {
    public static void main(String[] args) {
        String Date;
        int num;
        int year;
        int month;
        int day;
        int num2;
        int num3;
        Scanner sc = new Scanner(System.in);

        System.out.println("날짜 입력하세요(-없이 8자리)");
        num = sc.nextInt();

        year = num / 10000;
        month = (num - (year * 10000)) / 100;
        day = num - ((year * 10000) + (month * 100));
        Date = year + "-" + month + "-" + day;

        System.out.println("날짜 : " + Date);
        System.out.println("년(1) 월(2) 일(3)중 하나를 입력하시오 : ");
        num2 = sc.nextInt();
        System.out.println("변경할 숫자를 입력하시오 : ");
        num3 = sc.nextInt();

        if (num2 == 1)
            year += num3;

        else if (num2 == 2)
            month += num3;
        else
            day += num3;
        Date = year + "-" + month + "-" + day;
        System.out.println("날짜 : " + Date);
        sc.close();
    }
}
