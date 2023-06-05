package src.Chap4;

class Cal02 {
    void add(int n1, int n2) { // 매개변수. 해당 매서드는 매개변수를 2개 받음.
        System.out.println("더하기 : " + (n1 + n2));
        // 스택을 종료하고, 복귀주소를 확인하고 복귀한다.
    }

    // minus
    void minus(int n1, int n2) {
        System.out.println("빼기 : " + (n1 - n2));
    }

    // multi
    void multi(int n1, int n2) {
        System.out.println("곱하기 : " + (n1 * n2));
    }

    // divide
    void divide(int n1, int n2) {
        System.out.println("나누기 : " + (n1 / n2));
    }
}

public class Meth02 {
    public static void main(String[] args) {
        Cal02 c1 = new Cal02(); // new를 하면 heap에 cal02타입 영역이 생김(c1).
        c1.add(10, 5); // 매개변수의 값 aguments(인수)를 넣어야함 (10,5)
        // 호출되는 순간 27열의 주소를 기억후 add으로 이동해 내부의 body가 실행됨. 종료되는 순간 복귀후 30열 실행
        // 10,5는 add라는 매서드의 스택으로 존재. 종료(복귀 전)할 때 사라짐. **지역변수(로컬변수)-생명주기가 짧음.

        c1.minus(10, 5);
        c1.multi(10, 5);
        c1.divide(10, 5);

    }
}