package ex14;

public class Thread01 {

    // 자바는 cpu가 하나의 스레드를 생성하여 실행된다.
    // 실 == main 메서드
    public static void main(String[] args) {

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("서브 쓰레드 : " + i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        for (int i = 0; i < 5; i++) {
            System.out.println("메인 쓰레드 : " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
