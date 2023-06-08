package ex05.ch03;

abstract class Animal {
    // 추상클래스, 통로역할로 만듦
    // 단독적으로 역할 못함, 구체적으로 정의 시키지 못할 때 사용
    abstract void speak(); // 추상메서드
}

class Dog extends Animal {
    void speak() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    void speak() {
        System.out.println("야옹");
    }
}

public class Exten03 {
    static void start(Animal u) {
        u.speak();
    }

    public static void main(String[] args) {
        // 부모<=자식,동물<=강아지 (o) | 자식<=부모,강아지<=동물 (x)
        Animal d = new Dog();
        start(d);

        Animal c = new Cat();
        start(c);
    }
}
