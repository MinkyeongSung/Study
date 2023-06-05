package src.Chap3;

//배열
//[] 1차원 [][]2차원. 자바는 잘안쓰고 콜렉션 씀. 편함.
public class P06 {
    public static void main(String[] args) {

        // 반복문과 배열
        // 인덱스라는 번호로 접근가능. 배열의 크기는 .length
        int[] s = new int[10];

        for (int i = 0; i < s.length; i++) {
            s[i] = i;
        }
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i] + " ");
        }

        // 배열의 초기화
        // 선언과 동시에 초기화 하려면 배열을 선언한 다음에 중괄호를 사용하여 배열 요소의 초기값을 적어 넣는다.
        // 이때는 연산자 new를 사용하지 않아도 배열이 생성된다. 크기지정도 필요x

        int[] scores = { 10, 20, 30, 40, 50 };
        for (int j = 0; j < scores.length; j++)
            System.out.println(scores[j] + " ");

        // 문자열 배열
        String[] toppings = { "페퍼로니", "버섯", "양파", "소시지", "베이컨" };

        for (String t : toppings) {
            System.out.println(t + " ");
        }

        // 2차원 배열
        // 같은 행의 요소를 중괄호로 묶으면 초기화 가능.

        int[][] seats = { { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 1, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 1, 1, 1, 0 } };

        int count = 0;
        for (int k = 0; k < seats.length; k++)
            for (int l = 0; l < seats[k].length; l++)
                count += seats[k][l];

        System.out.println("현재 관객 수는 " + count + "명입니다.");
    }
}
