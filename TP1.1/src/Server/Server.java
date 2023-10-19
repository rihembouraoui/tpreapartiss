package Server;
import java.io.*;
import java.net.*;
public class Server {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
				try {
					int serverPort=1234;

					ServerSocket sc = new ServerSocket(serverPort);

					System.out.println("Server created");

					Socket s = sc.accept();

					System.out.println("Server connected");

					s.close();

					} catch (IOException e)
					{

					e.getMessage();

			}

		

	}

}
