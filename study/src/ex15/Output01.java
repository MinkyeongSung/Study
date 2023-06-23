package ex15;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Output01 {
    public static void main(String[] args) {
        OutputStream os = System.out;
        OutputStreamWriter ow = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(ow);

        try {
            bw.write("안녕");
            bw.flush(); // 없으면 안녕이 출력 안됨.
            // 여러번 할 때는 마지막에 \n 필수
            // 버퍼 통신의 끝을 알려줘야함 bw.write("안녕"\n);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
