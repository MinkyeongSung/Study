package ex16;
//스레드들이 Printer 객체를 동시에 접근하여서 배열을 출력해서 엉망이 된다.
class printer {
    void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread1 extends Thread {
    printer prn;
    int[] myarr = { 10, 20, 30, 40, 50 };

    MyThread1(printer prn) {
        this.prn = prn;
    }

    public void run() {
        prn.print(myarr);
    }
}

class MyThread2 extends Thread {
    printer prn;
    int[] myarr = { 1, 2, 3, 4, 5 };

    MyThread2(printer prn) {
        this.prn = prn;
    }

    public void run() {
        prn.print(myarr);
    }
}

public class SynchronizationErr01 {

    public static void main(String[] args) {
        printer obj = new printer();
        MyThread1 t1 = new MyThread1(obj);
        MyThread1 t2 = new MyThread1(obj);
        t1.start();
        t2.start();
    }
}
