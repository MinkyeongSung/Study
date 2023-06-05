package ex04;

public class DeskLamp {
    // 인스턴스 변수 정의
    boolean isOn; // boolean타입은 is를 붙인다. (True or False)

    // 메소드정의
    void turnOn() { // public void trunOn(){}
        isOn = true;
    }

    void turnOff() {
        isOn = false;
    }

    String print() { // public String toString(){} 오버라이딩을 배우고 나서 사용.
        return "현재 상태는 " + (isOn == true ? "켜짐" : "꺼짐");
    }
}
