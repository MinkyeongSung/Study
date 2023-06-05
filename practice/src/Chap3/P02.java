package src.Chap3;

import java.util.Scanner;

//학생들의 성적을 받아 학점을 출력
//x>90 A, 80~89 B, 70~79 C, 60~69 D, <60 F
public class P02 {
    public static void main(String[] args) {
        int score;
        String grade;

        Scanner sc = new Scanner(System.in);
        System.out.println("성적을 입력하시오 : ");
        score = sc.nextInt();

        if (score > 90)
            grade = "A";
        // 라고 할 필요없이 (score>=80으로 충분. 90부턴 이미 A라고 조건문을 작성했다)
        else if (89 >= score && score >= 80)
            grade = "B";

        else if (79 >= score && score >= 70)
            grade = "C";

        else if (69 >= score && score >= 60)
            grade = "D";

        else
            grade = "F";

        System.out.println("학점 : " + grade);
        sc.close();

    }
}
