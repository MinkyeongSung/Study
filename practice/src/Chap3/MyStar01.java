package src.Chap3;

public class MyStar01 {
    public static void main(String[] args) {
        int n = 3;

        // 윗줄

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // 아랫줄 (윗줄을 다 출력한 후 실행됨)

        // 공백
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "); // 공백 출력
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*"); // 별 출력
            }

            System.out.println(); // 줄 바꿈
        }
    }
}

/*
 ***  
  * 
 */