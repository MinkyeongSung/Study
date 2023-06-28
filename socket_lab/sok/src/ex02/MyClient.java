package ex02;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {

    public MyClient() throws IOException {
        // 1. 서버 연결 (localhost == 127.0.0.1 루프백 주소, 나갔다 다시 돌아옴)
        // 192.168.200.175 (내 컴)
        // 192.168.200.58 (강사님)
        // 192. 는 공유기가 만들어낸 사설(가짜)ip
        Socket socket = new Socket("127.0.0.1", 10000);

        // 2. 서버쪽으로 메시지 전송
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(socket.getOutputStream())
        );
        writer.write("Hello"); // 버퍼 8192 바이트
        writer.write("\n");
        writer.flush(); //플러시를 해줘야 한다. 역슬러시n 해줘야함

        // 3. 키보드 버퍼 연결 - 키보드 메시지를 받아서!
//    Scanner sc = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String requestMsg = reader.readLine(); // while 대기

    }


    public static void main(String[] args) {

        try {
            new MyClient();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
