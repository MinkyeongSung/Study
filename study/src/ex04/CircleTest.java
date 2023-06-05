package ex04;

public class CircleTest {
    public static void main(String[] args) {
        Circle obj; // 변수 선언
        obj = new Circle(); // 객체 생성
        obj.radius = 100;
        obj.color = "blue"; // 객체의 필드 접근
        double area = obj.getArea(); // double, return
        System.out.println("원의 면적=" + area);
    }
}
