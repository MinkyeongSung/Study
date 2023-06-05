package src.Chap3;

public class P061 {
    public static void main(String[] args) {
        int[][] seats = {
                { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 1, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 1, 1, 1, 0 }
        };
        int count = 0;
        for (int i = 0; i < seats.length; i++) {
            for (int k = 0; k < seats[i].length; k++) {
                count += seats[i][k];
            }
        }
        System.out.println("현재 관객 수는 " + count + "명입니다.");
    }
}
// 넘기다 카운트가 끝나고 exit가 있는 스레드로 넘어가는데 거기서 스탭인 아웃을 통해서 확인가능.
