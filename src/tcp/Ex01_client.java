package tcp;

import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Ex01_client {
	public static void main(String[] args) throws Exception {
		// 192.168.42.103, 12345
		Socket sock = new Socket("192.168.42.103", 12345);
		System.out.println("클라이언트 실행!!");
		
		OutputStream os = sock.getOutputStream();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수 입력 : ");
		int data = sc.nextInt();
		
		os.write(data);
		os.close(); sock.close();
	}
}
