package ex05.ch03;

class 지구인 {

}

class 아시아인 extends 지구인 {
    void speak() {
        System.out.println("아시아어");
    }
}

class 한국인 extends 아시아인 { // 추상클래스
    void speak() {
        System.out.println("한국어");
    }
}

class 홍길동 extends 한국인 {// 오브젝트. 구체적 (홍길동, 임꺽정, 베토벤...)
}

public class Exten01 {
    public static void main(String[] args) {
        한국인 p1 = new 한국인();
        p1.speak();
        아시아인 p2 = new 아시아인();
        p2.speak();
        아시아인 p3 = new 한국인();
        p3.speak();
    }
}
