package src.Chap4;

/*
 if, else-if, else 문의 내용이 단 한줄인 경우 중괄호를 생략할 수 있습니다.

 if(hp==100)
 sout("체력이 가득합니다.");
else if (hp>=50)
sout("체력이 손실되었습니다.");
else
sout("체력이 부족합니다.");

문제
체력과 마력이 동시에 2000이상이여야만 착용 가능한 아이템이 있다. 
체력과 마력을 입력하여 착용 결과를 출력하는 메소드 war()를 완성하고, 
출력 예와 같은 결과를 얻으시오.ㅣ

출력 예)
아이템 장착 완료!
아이템을 착용 할 수 없습니다.
 */
public class RareItem {
    public static void main(String[] args) {
        wear(2400, 2000); // 체2400, 마2000 => 아이템 장착완료!!
        wear(3800, 1200); // 체3800, 마1200 => 아이템 착용 할 수 없습니다.
    }

    public static void wear(int hp, int mp) {
        /* 해당 메소드를 완성하시오 */
        if (2000 <= hp && 2000 <= mp) {
            System.out.println("아이템 장착 완료!");
        } else {
            System.out.println("아이템을 착용 할 수 없습니다.");
        }
    }
}
