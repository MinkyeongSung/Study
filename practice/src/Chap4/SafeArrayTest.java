package src.Chap4;

class SafeArray {
    private int a[]; // a배열
    public int length; // 크기

    public SafeArray(int size) {
        a = new int[size];
        length = size;
    }

    public int get(int index) {
        if (index >= 0 && index < length) {
            return a[index];
        }
        return -1;
    }

    public void put(int index, int value) { // 배열의 크기를 벗어난 인덱스는 통과. 그렇지 않으면 오류출력문. void.
        if (index >= 0 && index < length) { // 인덱스는 0이상이고 배열의 크기보다 작다.
            a[index] = value; // 통과
        } else
            System.out.println("잘못된 인덱스 " + index); // 오류
    }
}

public class SafeArrayTest {
    public static void main(String[] args) {
        SafeArray array = new SafeArray(2); // 여기에 인덱스 입력

        for (int i = 0; i < (array.length + 1); i++) {
            array.put(i, i * 10);
        }
    }
}
