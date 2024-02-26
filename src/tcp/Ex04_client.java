package tcp;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Ex04_client {
	public static void main(String[] args) throws Exception{
		Socket sock = new Socket("127.0.0.1" ,1213);
		Scanner sc = new Scanner(System.in);
		
		OutputStream out = sock.getOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(out);
		
		Ex04_DTO dto = new Ex04_DTO();
		System.out.println("이름 입력 : ");
		dto.setName(sc.next());
		System.out.println("주소 입력 : ");
		dto.setAddr(sc.next());
		
		oos.writeObject(dto);
		oos.close(); out.close(); sock.close();
		
	}
}
