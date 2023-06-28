package ex06;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServer {

    ServerSocket serverSocket;
    Socket socket;
    BufferedReader reader;
    BufferedWriter writer;
    Scanner keyboard;

    public MyServer() throws Exception {
        // 1. 메인쓰레드는 리스너를 담당
        serverSocket = new ServerSocket(10000); // 서버 소켓 생성
        socket =  serverSocket.accept(); // 리스너 대기중(클라이언트의 연결을 기다림)
        System.out.println("클라이언트가 연결되었습니다");
        System.out.println(socket.getPort());
        System.out.println(socket.getInetAddress());

        connectLine(); //클라이언트와의 통신을 위한 입출력 스트림을 설정
        read(); // 클라이언트로부터 메시지를 수신하는 역할
        write(); // 클라이언트에게 메시지를 전송하는 역할
    }

    public static void main(String[] args) {
        try {
            new MyServer(); // 객체 생성, 실행
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


















    private void connectLine() throws Exception{
        // 클라이언트로부터의 입력을 받을 BufferedReader를 생성
        reader = new BufferedReader(
                new InputStreamReader(socket.getInputStream(),"utf-8")
        );
        // 클라이언트에게 출력할 BufferedWriter를 생성
        writer = new BufferedWriter(
                new OutputStreamWriter(socket.getOutputStream(),"utf-8")
        );
        keyboard = new Scanner(System.in,"utf-8");
    }

    //새로운 스레드를 생성하여 사용자 입력을 받고, 입력된 메시지를 BufferedWriter를 사용하여 클라이언트에게 전송
    private void write(){
        new Thread(() -> {
            try {
                while(true){
                    String msg = keyboard.nextLine();
                    writer.write(msg);
                    writer.write("\n");
                    writer.flush();
                }

            }catch (Exception e){
                e.printStackTrace();
            }
        }).start();
    }


    // 새로운 스레드를 생성하여 클라이언트로부터의 입력을 BufferedReader를 사용하여 읽고,
    // 메시지를 분석하여 사용자 이름과 내용을 추출한 후 출력합니다. 예외가 발생하면 "괜찮아!!"라는 메시지를 출력
    private void read(){
        new Thread(() -> {
            try {
                while(true){
                    try {
                        String msg = reader.readLine(); // 버퍼 비우기
                        String username = msg.split(":")[0];
                        String body = msg.split(":")[1];
                        System.out.println(username+" : "+body);
                    }catch (Exception e){
                        System.out.println("괜찮아!!");
                    }

                }

            }catch (Exception e){
                e.printStackTrace();
            }
        }).start();
    }
}