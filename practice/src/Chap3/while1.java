package src.Chap3;

public class while1 {
    public static void main(String[] args) {
        // for -> 끝이 있는 반복분
        // while -> 끝을 모르는 반복문
        int i = 1;
        while (true) { // 조건식 true를 리턴 ( 1==1)

            if (i == 100) {
                break;
            }
            System.out.println("Hello world : " + i);
            i++; // i = i + 1; 증감식
        }
    }
}
