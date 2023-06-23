package ex14;

/**
 * MyThread 클래스는 스레드를 상속받는다. 하나의 메소드 run()만을 가지고 있는데
 * run()은 이 스레드가 시작되면 자바 런타임 시슽메에 의하여 호출된다.
 * 스레드가 실행하는 모든 작업은 이 메소드 안에 있어야 한다. 현재는 단순히 0부터 10까지를 화면에 출력한다.
 */
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++)
            System.out.println(i + " ");
    }
}

public class Thread02 {
    public static void main(String[] args) {
        // 스레드를 실행시키려면 스레드에서 파생된 클래스의 인스턴스를 생성한 후 start()를 호출한다.
        // Thread 타입의 변수 t가 선언되고 MyThread의 객체를 생성하였다.
        // 객체가 생성되었다고 스레드가 바로 시작되는 것은 아니다. start()를 호출해야 실행된다.
        Thread t = new MyThread();

        t.start();
    }
}
