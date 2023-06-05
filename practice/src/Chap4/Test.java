package src.Chap4;

class A {
    // private int a; // 해당 클래스 전용.
    int b; // 디폴트
    public int c; // 공용.외부접근가능.
}

public class Test {
    public static void main(String[] args) {
        A obj = new A();

        // obj.a = 10; 전용 멤버는 다른 클래스에서는 접근 안 됨 private
        obj.b = 20; // 해당패키지안에서 접근가능
        obj.c = 30; // 접근 가능
    }
}
