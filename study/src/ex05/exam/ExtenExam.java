package ex05.exam;

class 육식동물 {
    public void print() {
    }
}

class Tiger extends 육식동물 {
    private String name; // 상태를 직접적으로 변경 못하게 private. 상태를 확인하기 위해선 this.

    public Tiger(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }
}

class Lion extends 육식동물 {
    private String name;

    public Lion(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }
}

public class ExtenExam {

    static void start(육식동물 u) {
        u.print();
    }

    public static void main(String[] args) {
        Lion lion = new Lion("사자1");
        Tiger tiger = new Tiger("호랑이1");
        start(lion);
        start(tiger);
    }
}

/*
 * package ex05.exam;
 * 
 * abstract class 육식동물 {
 * abstract void print();
 * }
 * 
 * class Tiger extends 육식동물 {
 * private String name;
 * 
 * public Tiger(String name) {
 * this.name = name;
 * }
 * 
 * public void print() {
 * System.out.println(name);
 * }
 * }
 * 
 * class Lion extends 육식동물 {
 * private String name;
 * 
 * public Lion(String name) {
 * this.name = name;
 * }
 * 
 * public void print() {
 * System.out.println(name);
 * }
 * }
 * 
 * public class ExtenExam {
 * 
 * static void start(육식동물 u) {
 * u.print();
 * }
 * 
 * public static void main(String[] args) {
 * 육식동물 lion = new Lion("사자1");
 * 육식동물 tiger = new Tiger("호랑이1");
 * start(lion);
 * start(tiger);
 * }
 * }
 */
// /*
// * 육식동물을 추상화(abstract)
// * 각 동물클래스를 육식동물에 extends
// * main에서 변수(동물1)을 육식동물(추상클래스)타입으로 선언
// */