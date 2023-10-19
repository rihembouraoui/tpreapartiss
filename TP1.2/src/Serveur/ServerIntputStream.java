package Serveur;
import java.io.* ;
import java.net.*;
import java.util.*;

public class ServerIntputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {


			int serverPort=1234;

			ServerSocket sc = new ServerSocket(serverPort);

			System.out.println("Server created");

			Socket s = sc.accept();

			System.out.println("Server connected");
			InputStream is = s.getInputStream();
			int val = is.read()*5;
			System.out.println("la valeur à envoyer au client"+val);
			OutputStream os = s.getOutputStream();
			os.write(val);
			s.close();

			} catch (Exception e) {e.printStackTrace();}
		   

			{

	}

	}

	}


