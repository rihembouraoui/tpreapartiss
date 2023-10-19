package Client;
import java.io.*;
import java.net.*;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
				try {

					int serverPort=1234;
					Socket s= new Socket("localhost",serverPort);
					System.out.println("I'm connected");
					s.close() ;

					} catch (IOException e) {

					e.getMessage();
					}
				

		
		

	}

}
