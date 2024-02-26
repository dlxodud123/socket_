package tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Ex02_client {
	public static void main(String[] args) throws Exception {
		// 192.168.42.103
		Socket sock = new Socket("192.168.42.103", 1213);
		
		OutputStream out = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("전송할 문자열 입력");
		String data = sc.next();
		
		dos.writeUTF(data);
		
		InputStream in = sock.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		
		String readData = dis.readUTF();
		System.out.println("수신 데이터 : " + readData);
		
		dis.close(); in.close();
		dos.close(); out.close(); sock.close();
	}
}
