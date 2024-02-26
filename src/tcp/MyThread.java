package tcp;

import java.io.*;
import java.net.*;

public class MyThread extends Thread{
	private Socket sock;
	MyThread(Socket sock){ this.sock = sock; }
	public void run() {
		try {
			InputStream in = sock.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			while(true) {
				String readData = dis.readUTF();
				System.out.println(readData);
			}
		} catch (IOException e) { e.printStackTrace(); }
	}
}
