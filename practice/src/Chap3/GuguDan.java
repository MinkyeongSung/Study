package src.Chap3;

public class GuguDan {
    public static void main(String[] args) {
        System.out.println("구구단");
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {

                System.out.print(i + "*" + j + "=" + i * j + ", ");
            }
            System.out.print("\b\b \n");

        }
    }
}
