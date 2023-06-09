package src.Chap5;

import src.Chap5.Unit.Protoss.Zealot;
import src.Chap5.Unit.Unit;
import src.Chap5.Unit.Protoss.Dragoon;
import src.Chap5.Unit.Terran.Firebat;
import src.Chap5.Unit.Terran.Marine;
import src.Chap5.Unit.Zerg.Hydra;
import src.Chap5.Unit.Zerg.Zergling;

//프로토스(2),저그(2),테란(2) 공격.
//프로토스에게 쉴드값을 부여할 경우 프로토스가 공격당하는 경우만 예외처르로 if문을 사용해야 할 듯?
//그러면 3종족을 합친 유닛이 아니라 종족별 유닛 추상화 클래스가 나은가? (그러지 않으면 if protossunit이 아닌 유닛별 개별적용해야할거 같음)
//지상, 공중, 양쪽모두 가능한 타입으로 나누면? attack을 landattack과 airatack으로? 없는 곳은 값을 0?
//유닛 개체에도 타입 나눠서 공격 불가능 출력?

// 230609 - super키워드를 사용하면 간단해진다. 
// 부모(추상)클래스에서 얻고자 하는 변수.
// 자식클래스에서는 super(변수값)
// 이렇게 하면 부모클래스에서 체력, 쉴드, 마나, 공격력등을 입력해두고 원하는 변수만 호출하여 사용가능.
// study의 Ch02 참고.
public class App {
    static void attack(Unit u1, Unit u2) {
        u2.setHp(u2.getHp() - u1.getAttack());
        System.out.println(u2.getName() + "이 " + u1.getName() + "에게 공격당했습니다");
        System.out.println(u2.getName() + "의 남은 hp : " + u2.getHp());
    }

    public static void main(String[] args) {
        Unit pz1 = new Zealot("질럿1", 160, 16);
        Unit pd1 = new Dragoon("드라군1", 180, 20);
        Unit zz1 = new Zergling("저글링1", 35, 4);
        Unit zh1 = new Hydra("히드라1", 80, 10);
        Unit tm1 = new Marine("마린1", 40, 6);
        Unit tf1 = new Firebat("파이어뱃1", 50, 18);

        attack(pz1, zz1);
        attack(pd1, zh1);

        attack(zz1, tm1);
        attack(zh1, tf1);

        attack(tm1, pz1);
        attack(tf1, pd1);

    }
}
