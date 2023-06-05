package src.Chap4;

class Accountt {

    // private int regNumber;
    private String name; // 전부 클래스 내부에서만 사용가능 (private)
    private int balance;

    // public
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // private의 값이 필요한경우
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

public class Account {
    public static void main(String[] args) {
        Accountt obj = new Accountt();
        obj.setName("Tom");
        obj.setBalance(100000); // setBalance를 이용해 private의 balance값을 설정.
        System.out.println("이름은 " + obj.getName() + "통장 잔고는 " + obj.getBalance() + "입니다. ");
    }
}
