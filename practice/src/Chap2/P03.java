package src.Chap2;

/*
 이름을 입력하시오 : 홍길동
 나이를 입력하시오 : 24
 홍길동님 안녕하세요! 24살이시네요.
 */
import java.util.Scanner;

public class P03 {

    public static void main(String[] args) {

        String name;
        int age;

        Scanner sc = new Scanner(System.in);

        System.out.println("이름을 입력하시오 : ");
        name = sc.nextLine();

        System.out.println("나이를 입력하시오 : ");
        age = sc.nextInt();

        System.out.println(name + "님 안녕하세요! " + age + "살 이시네요.");
        sc.close();

    }
}
