package ex03;

//임포트를 안해도 되는 라이브러리 = 내장 라이브러리
// alt + shift + o
// ()는 전부 메서드이다 void random(){}
public class Rodk {

    static void random() {
    }

    public static void main(String[] args) {
        int n1 = (int) (Math.random() * 3) + 1;
        System.out.println(n1);

    }
}
