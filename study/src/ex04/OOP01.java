package ex04;

class Player {
    String name;
    int thirsty;
    // 0~ 100 클 수록 목마름 (범주)도메인이 정해져 있는 데이터
    // if로 처리해야한다.

    public void drink() {
        thirsty = thirsty - 30; // 충돌날 일이 없어 this 필요없음.
    }

    public Player(String name, int thirsty) {
        this.name = name; // heap 변수는 this 사용 (사용시 String name의 name으로 옮김)
        this.thirsty = thirsty; // 아니면 name = n; 식으로 해도 되지만 헷갈릴 가능성 있음.
    }

}

public class OOP01 {
    public static void main(String[] args) {
        // Player p = new Player(); 디폴트 생성자는 아무것도 없으면 자동 생성되지만 1개라도 만들었으면 생성 안됨
        Player p1 = new Player("홍길동", 100); // null, 변수를 선언했는데 값이 없는 상태. 디폴트 생성자가 자동생성.
        Player p2 = new Player("임꺽정", 100);

        System.out.println(p1.name);
        System.out.println(p2.name);

        p2.drink();

        System.out.println(p1.thirsty);
        System.out.println(p2.thirsty);
    }
}
