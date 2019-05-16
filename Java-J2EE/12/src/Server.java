import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(1999);
			Socket s = ss.accept();
			DataInputStream dis = new DataInputStream(s.getInputStream());
			String k = dis.readUTF();
			System.out.println("File Transferred");
			FileOutputStream fos = new FileOutputStream("/Users/piyushmehta/6thSemISE/Java-J2EE/12/hello.txt");
			byte[] b = k.getBytes();
			fos.write(b);

		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
}
