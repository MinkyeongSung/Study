package ex05.composit;

public class BurgerSet { // 다형성을 사용하기 때문에 extends burger, coke 두개를 쓸 필요 X (다중사용 불가)
    // 컴퍼지션
    private Burger burger;
    private Coke coke;
    private Potato potato;

    public BurgerSet() { // 생성자를 통해 초기화
        this(new Burger(), new Coke(), new Potato());
    }

    private BurgerSet(Burger burger, Coke coke, Potato potato) {
        this.burger = burger;
        this.coke = coke;
        this.potato = potato;
    }

    public Burger getBurger() {
        return burger;
    }

    public Coke getCoke() {
        return coke;
    }

    public Potato getPotato() {
        return potato;
    }

}