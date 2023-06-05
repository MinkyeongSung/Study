package ex00;

class 엘리스 {
    static String name = "엘리스";
    int height = 160;

    public 엘리스() {
    }

    void eat(int qty) {
        this.height = this.height + (10 * qty);
        System.out.println("키" + this.height);
    }
}

public class MemApp {
    public static void main(String[] args) {
        엘리스 e = new 엘리스(); // height와 eat이 생김.0
        e.eat(5);
    }
}