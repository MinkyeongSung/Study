package ex05.ch04;

//추상화 클래스
//get은 받고싶은것, set은 변경하고 싶은것
public abstract class ProtossUnit {
    // 이름, 체력, 공격력을 받고 공격받은후의 체력을 변경
    public abstract String getName();

    public abstract int getHp();

    public abstract int getAttack();

    public abstract void setHp(int hp);
    // 공격받은 후 잔여Hp를 계산하는 식
    // u2.setHp(u2.getHp() - u1.getAttack());를 통해 getHp의 값이 변경된다.

}
