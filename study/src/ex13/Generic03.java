package ex13;

class Data<T> {
    int status;// 200
    T body; // 22 값
}

public class Generic03 {

    Data<?> gentNum(int check) { // ? 와일드카드
        if (check == 1) {
            Data<String> data = new Data<>();
            return data;

        }

        else {
        }
        Data<String> data = new Data<>();
        return data;
    }

    Object gentNum2(int check) { // 단점. 쓸 때 다운캐스팅
        if (check == 1) {
            return "안녕";
        } else {
            return "안녕";
        }
    }

    public static void main(String[] args) {
        Generic03 g3 = new Generic03();
        int n = (int) g3.gentNum2(1);
        // Data<String> d = g3.gentNum(1);
    }
}
