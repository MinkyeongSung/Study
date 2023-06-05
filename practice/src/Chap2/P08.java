package src.Chap2;

//비트 연산자 실습하기
public class P08 {
    public static void main(String[] args) {
        byte status = 0b01101001;
        System.out.println("문열림 상태 = " + ((status & 0b00000100) != 0));
        ;
    }
}
