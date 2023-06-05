package src.Chap2;

// 형변환/ 초 단위의 시간을 받아서 분,초로 표현
import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("초를 입력하시오: ");
        int time = sc.nextInt();
        int sec = (time % 60);
        int min = (time / 60);

        System.out.println(time + "초는 " + min + "분 " + sec + "초입니다");
        sc.close();
    }
}