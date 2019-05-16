import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.net.Socket;

public class SocketClient {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("localhost", 1999);
			BufferedReader reader = new BufferedReader(new FileReader("/Users/hemantj/eclipse-workspace/Socket/hello.txt"));
			byte []b = new byte[30]; 
			String k = reader.readLine(); 
			DataOutputStream dos = new DataOutputStream(s.getOutputStream()); 
			dos.writeUTF(k); 
            System.out.println("Transfer Complete"); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
