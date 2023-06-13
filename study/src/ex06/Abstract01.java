package ex06;

/**
 * 1. 추상클래스는 new 할 수 없다.
 * 2. 추상클래스는 일반메서드와 추상메서드를 가질 수 있다. (abstract void speak())
 * 3. 추상클래스는 상태변수를 가질 수 있다. (String name)
 */
abstract class 동물 {

    String name;

    public void run() {
        System.out.println("달린다.");
    }

    public abstract void speak();
}

class 사자 extends 동물 {

    @Override
    public void speak() {
        System.out.println("어흥");
    } // speak에 대한 강제성을 가져서 구현해야한다.

}

public class Abstract01 {
    public static void main(String[] args) {
        // new 동물(); abstract으로 인해 안됨.
    }
}
