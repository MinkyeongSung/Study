package ex03;

import java.io.*;
import java.net.Socket;

/**
 * 클라이언트는 read 버퍼를 추가로 만들고
 * 서버는 write 버퍼를 추가로 만든다.
 */
public class MyClient {

    public MyClient() throws IOException {

        // 1. 서버 연결
        Socket socket = new Socket("127.0.0.1", 10000);

        // 2. 클라이언트의 요청
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(socket.getOutputStream(), "utf-8") // utf-8 3바이트씩 끊어 읽이
        );

        writer.write("text/html");
        writer.write("\n");
        writer.flush();

        // 3. Read버퍼로 읽어서 모니터 출력
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(socket.getInputStream(), "utf-8")
        );
        String msg = reader.readLine();
        System.out.println("서버로부터의 응답: " + msg);

    }

    public static void main(String[] args) {
        try {
            new MyClient();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}