package ex04;

public class DeskLampTest {
    public static void main(String[] args) {
        DeskLamp myLamp = new DeskLamp(); // 객체 생성. heap에 turnOn, turnOff, print, isOn

        // 메소드 호출
        myLamp.turnOn();
        String result1 = myLamp.print();
        System.out.println(result1);
        myLamp.turnOff();
        String result2 = myLamp.print();
        System.out.println(result2);
    }
}
