package exam2;

//실행하면서 디버깅. 계속 테스트하면서 눈으로 확인하기.
//모르는건 검색
//샘플링
//조건분리 .코드작성. 예외처리(else를 적게 쓰는게 깔끔/모듈화 시키기 힘듦). 
public class ExamTest {

    public static void main(String[] args) {
        item(2500, 2000);
        item(2000, 1800);
    }

    public static void item(int hp, int mp) {

        if (2000 <= hp && 2000 <= mp) {
            System.out.println("아이템 착용 완료");
        } else {
            System.out.println("아이템을 착용 할 수 없습니다.");
        }
    }
}
