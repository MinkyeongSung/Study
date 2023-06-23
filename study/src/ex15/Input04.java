package ex15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input04 {
    public static void main(String[] args) {
        // 연결(키보드)
        try {
            InputStream in = new FileInputStream("input.txt"); // 프로젝트에서부터 파일을 찾음.
            InputStreamReader ir = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(ir);

            String allData = "";
            while (true) {
                String data = br.readLine();
                allData = allData + data;

                if (data == null)
                    break;
            }
            System.out.println(allData);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}