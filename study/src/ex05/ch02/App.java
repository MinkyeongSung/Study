package ex05.ch02;

public class App {

    static void attack(ProtossUnit u1, ProtossUnit u2) {
        u2.hp = u2.hp - u1.attack; // 접근못하게 private만들어서 해야함. 실행은 되지만 옳지 않음.
        System.out.println(u2.name + "이 공격당했습니다.");
        System.out.println(u2.name + "의 남은 hp : " + u2.hp);
    }

    public static void main(String[] args) {
        ProtossUnit z1 = new Zealot("질럿1", 100, 10);
        ProtossUnit d1 = new Dragoon("질럿1", 100, 10);

        // attack(z1, z2);
        attack(z1, d1);
        // attack(d1, z2);
        // attack(z1, z2);
    }
}