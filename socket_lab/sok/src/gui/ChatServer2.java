package gui;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ChatServer2 {
	
	Vector<ClientThread2> vc;
	
	public ChatServer2() {
		vc = new Vector<ClientThread2>();
		ServerSocket server = null;
		int port = 8888;
		try {
			server = new ServerSocket(port);
		} catch (Exception e) {
			System.err.println("Error in ChatServer");
			e.printStackTrace();
			System.exit(1);
		}
		System.out.println("*********************************");
		System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��� �ֽ��ϴ�.");
		System.out.println("*********************************");
		try {
			while(true){
				Socket sock = server.accept();
				ClientThread2 ct = 
					new ClientThread2(this,sock);
				ct.start();
				vc.add(ct);
			}
		} catch (Exception e) {
			System.err.println("Error in Socket");
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	//���ӵ� ��� Client���� �޼����� ������.
	public void  sendAllClient(String msg) {
		for (int i = 0; i < vc.size(); i++) {
			ClientThread2 ct = vc.get(i);
			ct.sendMessage(msg);
		}
	}
	//Vector���� ClientThread �����Ѵ�.
	public void  removeClientThread(ClientThread2 ct) {
		vc.remove(ct);
	}
	
	class ClientThread2 extends Thread{
		
		ChatServer2 cs;
		Socket sock;
		BufferedReader in;
		PrintWriter out;
		String id = "�͸�";
		
		public ClientThread2(ChatServer2 cs, Socket sock) {
			this.cs = cs;
			this.sock = sock;
		}
		
		public void run(){
			try {
				System.out.println(sock + " ���ӵ�");
				in = new BufferedReader(
						new InputStreamReader(sock.getInputStream()));
				out = 
					new PrintWriter(sock.getOutputStream(),true);
				//ó�� Ŭ���̾�Ʈ�� ������ �޼���
				out.println("����Ͻ� ���̵� �Է��ϼ���.");
				String data = null;
				boolean done = false;
				while(!done){
					String line = in.readLine();
					if(line==null) done = true;
					else routine(line);
				}
			} catch (Exception e) {
				cs.removeClientThread(this);
				System.err.println(sock+"["+id+"] ������");
				e.printStackTrace();
			}
		}
		
		public void routine(String line) {
			//CHATALL:������ ��Ÿ�� �ݿ���
			int idx = line.indexOf(':');
			//int len;
			String cmd = line.substring(0,idx);//CHATALL
			String data = line.substring(idx+1);//������ ��Ÿ�� �ݿ���
			if(cmd.equals(ChatProtocol2.ID)){
				//ID:aaa
				if(data!=null&&data.length()>0)id=data;
				cs.sendAllClient(ChatProtocol2.CHATLIST+":"+
						getIds());//CHATLIST:aaa,bbb,ccc
				cs.sendAllClient(ChatProtocol2.CHATALL+":"+
						"["+id+"]�� �����Ͽ����ϴ�.");
			}else if(cmd.equals(ChatProtocol2.CHAT)){
				//CHAT:bbb;�������?
				idx = data.indexOf(';');
				cmd = data.substring(0,idx);//bbb
				data = data.substring(idx+1);//�������?
				ClientThread2 ct = findThread(cmd/*bbb*/);
				if(ct!=null){
					ct.sendMessage(ChatProtocol2.CHAT+":"+
							"["+id/*aaa*/+"]"+data);
				}else{
					sendMessage(ChatProtocol2.CHAT+":"+
						"["+cmd+"] ����ڰ� �ƴմϴ�.");
				}
			}else if(cmd.equals(ChatProtocol2.CHATALL)){
				cs.sendAllClient(ChatProtocol2.CHATALL+":"+
						"["+id+"]"+data);
			}else if(cmd.equals(ChatProtocol2.MESSAGE)){
				//(C->S)MESSAGE:bbb;��ø�.... (aaa->bbb ����)
				//(S->C)MESSAGE:aaa;��ø�....
				idx = data.indexOf(';');
				cmd = data.substring(0,idx);//bbb
				data = data.substring(idx+1);//��ø�....
				ClientThread2 ct = findThread(cmd/*bbb*/);
				if(ct!=null){
					ct.sendMessage(ChatProtocol2.MESSAGE+":"+
							id/*aaa*/+";"+data);
				}else{
					sendMessage(ChatProtocol2.CHAT+":"+
							"["+cmd+"] ����ڰ� �ƴմϴ�.");
				}
			}
		}
		
		//�Ű������� id�� ClientThread ã�Ƽ� ����
		public ClientThread2 findThread(String id2){
			ClientThread2 ct = null;
			for (int i = 0; i < vc.size(); i++) {
				ct = vc.get(i);
				if(ct.id.equals(id2)) break;
			}
			return ct;
		}
		
		//���ӵ� ��� id�� ����(; ����) ex)aaa,bbb,ȫ�浿
		public String getIds(){
			String ids = "";
			for (int i = 0; i < vc.size(); i++) {
				ClientThread2 ct = vc.get(i);
				ids+=ct.id+",";//aaa,bbb,ccc,ddd,
			}
			return ids;
		}
		
		public void sendMessage(String msg){
			out.println(msg);
		}
	}
	
	public static void main(String[] args) {
		new ChatServer2();
	}
}
