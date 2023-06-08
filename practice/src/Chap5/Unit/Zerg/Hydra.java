package src.Chap5.Unit.Zerg;

import src.Chap5.Unit.Unit;

public class Hydra extends Unit {
    String name;
    int hp;
    int attack;

    public Hydra(String name, int hp, int attack) {
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
