package ex04;

//상자를 나타내는 Box 클래스. 가로,세로,높이 필드로 부피계산 메소드.

class Boxinfo {
    int width;
    int length;
    int height;

    double getvolume() {
        return (double) width * length * height;
    }
}

public class Box {
    public static void main(String[] args) {
        Boxinfo b;
        b = new Boxinfo();
        b.width = 20;
        b.length = 20;
        b.height = 30;
        System.out.println("상자의 가로, 세로, 높이는 " + b.width + ", " + b.length + ", " + b.height + "입니다.");
        System.out.println("상자의부피는 " + b.getvolume() + "입니다.");
    }
}