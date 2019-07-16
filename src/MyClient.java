import java.io.*;
import java.net.*;

public class MyClient {
	public static void main(String[] args) 
			throws UnknownHostException, IOException {
		Socket s = new Socket("localhost", 8888);
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		dos.writeUTF("Hello, Manisha.");
		dos.flush();
		s.close();
	}
}
