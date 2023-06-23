package ex14;

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i <= 10; i++)
            System.out.println(i + " ");
    }
}

public class Runnable01 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}
