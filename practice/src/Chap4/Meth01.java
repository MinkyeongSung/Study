package src.Chap4;

//계산기 클래스
class Cal01 {
    // 상태없이 행위만. (객체지향x)
    // 자주 사용되는 것을 편하게 호출하기 위해 생성. 캡슐화
    void add() {// 매서드의 제일 기본형 void 리턴타입.
        System.out.println("add 호출됨");
    }

    void minus() {
        System.out.println("minus 호출됨");
    }

    void multi() {
        System.out.println("multi 호출됨");
    }

    void divide() {
        System.out.println("divide 호출됨");
    }
}

public class Meth01 {
    public static void main(String[] args) {
        // n = 1; 타입이 없어 오류
        Cal01 c1 = new Cal01(); // Cal01 클래스에 c1변수 new로 새로운 인스턴스. ()로 호출
        c1.add();
        c1.minus();
        c1.multi();
        c1.divide();

        // Cal01 c1 = new Cal01(); 이름(주소)이 같아서 오류(c1)
        Cal01 c2 = new Cal01();
        c2.add();
        c2.minus();
        c2.multi();
        c2.divide();
        // 호출시 c1, c2 서로 다른공간에 있는 것을 호출.
    }
}
