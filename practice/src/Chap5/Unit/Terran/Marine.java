package src.Chap5.Unit.Terran;

import src.Chap5.Unit.Unit;

public class Marine extends Unit {
    String name;
    int hp;
    int attack;

    public Marine(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public int getAttack() {
        return attack;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

}
