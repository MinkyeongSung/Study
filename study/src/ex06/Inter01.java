package ex06;

/**
 * 1. 인터페이스는 new 할 수 없다.
 * 2. 인터페이스는 변수를 만들 수 있다.
 * 
 */
interface remote {
    int NUM = 10; // public static final이 생략.

    void run(); // public abstract
}

public class Inter01 {
    public static void main(String[] args) {
        System.out.println(remote.NUM);
    }
}
