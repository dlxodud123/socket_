package tcp;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Ex03_client01 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Socket sock = new Socket("127.0.0.1", 1213);
		OutputStream out = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		
		System.out.println("송신 데이터 입력 : ");
		String data = sc.next();
		dos.writeUTF(data);
		
		dos.close(); out.close(); sock.close(); sc.close();
		
	}
}
