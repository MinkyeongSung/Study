package src.Chap5;

/**
 * 다중 상속 예제
 */
class Shape {
    protected int x, y;
}

interface Drawable {
    void draw();
}

// 상속과 동시에 인터페이스를 구현.
class Circle extends Shape implements Drawable {
    int radius;

    public void draw() {
        System.out.println("Circle Draw at (" + x + ", " + y + ")");
    }
}

public class TestInterface2 {
    public static void main(String[] args) {
        Drawable obj = new Circle();
        obj.draw();
    }
}