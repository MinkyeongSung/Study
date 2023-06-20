package ex13;

public class Collect01 {

    void callByValue(int num) {
        num = 2;
    }

    void callByValue(Car car) {
        car.num = 2;
    }

    public static void main(String[] args) {
        Collect01 cc = new Collect01();

        Car car = new Car(3);
        cc.callByValue(car);
        System.out.println(car.num);

    }
}

class Car {
    int num;

    public Car(int num) {
        this.num = num;
    }
}