package src.Chap5;

/**
 * 원격제어인터페이스
 */
interface RemoteControl {
    // 온오프만 보여주는 인터페이스
    void turnOn();

    void turnOff();

    public default void printBrand() {
        System.out.println("Remote Control 기능 TV");
    }
}

class Television implements RemoteControl {
    boolean on;

    // 참일때 켜짐. 거짓일때 꺼짐
    public void turnOn() {
        on = true;
        System.out.println("TV가 켜졌습니다.");
    }

    public void turnOff() {
        on = false;
        System.out.println("TV가 꺼졌습니다.");
    }

    @Override
    public void printBrand() {
        System.out.println("Power Java TV입니다.");
    }
}

public class TestInterface1 {
    public static void main(String[] args) {
        RemoteControl obj = new Television();
        obj.turnOn();
        obj.turnOff();
        obj.printBrand();
    }
}
