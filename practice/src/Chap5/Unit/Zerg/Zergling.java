package src.Chap5.Unit.Zerg;

import src.Chap5.Unit.Unit;

public class Zergling extends Unit {
    String name;
    int hp;
    int attack;

    public Zergling(String name, int hp, int attack) {
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
