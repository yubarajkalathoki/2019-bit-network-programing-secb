import java.io.*;
import java.net.*;
public class MyServer {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8888);
		Socket s = ss.accept();
		DataInputStream dis = new DataInputStream(s.getInputStream());
		String message = dis.readUTF();
		System.out.println(message);
		ss.close();
	}
}
