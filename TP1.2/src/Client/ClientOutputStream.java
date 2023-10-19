package Client;
import java.io.*;
import java.net.*;
import java.util.*;


public class ClientOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				int serverPort=1234;
				Scanner val;
				Socket s= new Socket("localhost",serverPort);
				System.out.println("I'm connected");
				System.out.println("entrer la valeur");

				try {
					val=new Scanner (System.in);
					int i= val.nextInt();
					OutputStream os = s.getOutputStream();
					os.write(i);
					InputStream is =s.getInputStream();
					System.out.println(is.read());
					
					} catch (Exception e) {e.printStackTrace();
					
					{
					s.close();
					}
					}


}

		