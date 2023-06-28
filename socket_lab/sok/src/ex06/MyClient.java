package ex06;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {

    public MyClient() throws IOException {
        // 1. 서버 연결
        Socket socket = new Socket("192.168.200.175", 10000);

        // 2. 버퍼 생성
        //서버로부터의 입력을 받을 BufferedReader를 생성
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(socket.getInputStream(), "utf-8")
        );

        // 서버에게 출력할 BufferedWriter를 생성
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(socket.getOutputStream(), "utf-8")
        );
        // 사용자의 입력을 받음. UTF-8 문자 인코딩을 사용하는 사용자 입력을 받기 위한 Scanner 객체를 생성
        Scanner keyboard = new Scanner(System.in, "utf-8");

        // 쓰기 스레드
        // 클라이언트가 서버로 메시지를 전송하는 역할
        new Thread(() -> {
            try {
                while (true) {
                    String msg = keyboard.nextLine(); // 무한 루프를 돌면서 사용자로부터 입력을 받고
                    writer.write(msg);  // 입력된 메시지를 서버로 전송
                    writer.write("\n"); // 메시지의 끝에는 개행 문자(\n)를 추가하고
                    writer.flush(); // flush() 메서드를 호출하여 버퍼를 비움
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        // 읽기 스레드
        //  클라이언트가 서버로부터 메시지를 수신하는 역할
        new Thread(() -> {
            try {
                while (true) {
                    String msg = reader.readLine(); // 무한 루프를 돌면서 reader를 사용하여 서버로부터 메시지를 읽음 .버퍼 비우기
                    System.out.println(socket.getInetAddress() + " : " + msg); // 읽어온 메시지는 클라이언트의 IP 주소와 함께 콘솔에 출력
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }

    public static void main(String[] args) {
        try {
            new MyClient();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}