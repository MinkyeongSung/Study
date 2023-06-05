package exam2;

/*
 요구사항.
 2300/1500(o) 2300/2000(x)
 -> int hp = 2300 int mp = 2000
 if문 사용해 둘다 이상이면 착용완료
 하나라도 미만이면 착용실패.
 */
public class RareItem {
    public static void main(String[] args) {
        wear(2400, 2000); // 체력 2400, 마력 2000 => 아이템 장착 완료!
        wear(3800, 1200); // 체력 3800, 마력 1200 => 아이템을 착용할 수 없습니다.
    }

    public static void wear(int hp, int mp) {
        /* 해당 메소드를 완성하시오 */
        if (hp >= 2000 && mp >= 2000) {
            System.out.println("아이템 착용 완료!!");
        } else {
            System.out.println("아이템을 착용 할 수 없습니다.");
        }

    }
}
