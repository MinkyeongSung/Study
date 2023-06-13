package ex06;

class 미니언 {
    public 미니언() {
        System.out.println("미니언이 생성되었습니다.");
    }
}

// 싱글 톤 패턴
class 바론 {
    private static 바론 instance = new 바론();

    public static 바론 getInstance() {
        return instance;
        // private 접근이 안되서 인스턴스 생성.
        // 스테이틱이라 처음부터 생성 후 힙에 저장. (한번만)

    }
}

public class SingIe01 extends Object { // 모든 클래스의 부모
    public static void main(String[] args) {
        미니언 m1 = new 미니언();
        미니언 m2 = new 미니언();
        미니언 m3 = new 미니언();

        바론 b1 = 바론.getInstance();

        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
        System.out.println(m3.hashCode());

        System.out.println(b1.hashCode());

        if (b1 instanceof 바론) { // b1과 바론은 같은 타입인가요? 파일검증
            System.out.println("같은 타입 입니다.");
        }

        if (b1 instanceof Object) {// 오브젝트는 최상위 클래스.(원래는 항상 숨겨져 있음(Object 바론))
            System.out.println("바론과 오브젝트는 같은 타입입니다");
        }
    }
}
