package ex05.ch02;

public class App {

    static void attack(ProtossUnit u1, ProtossUnit u2) {
        u2.hp = u2.hp - u1.attack;
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);

    }

    public static void main(String[] args) {
        ProtossUnit z1 = new Zealot("질럿1", 100, 10);
        ProtossUnit z2 = new Zealot("질럿2", 100, 10);
        ProtossUnit d1 = new Zealot("드라군1", 100, 5);
        ProtossUnit d2 = new Zealot("드라군2", 100, 5);
        ProtossUnit dt1 = new Zealot("다크템플러1", 100, 20);
        ProtossUnit dt2 = new Zealot("다크템플러2", 100, 20);

        attack(z1, z2);
        attack(d1, d2);
        attack(dt1, dt2);

    }
}