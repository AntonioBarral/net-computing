package ClientConnections;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client extends Thread {

	private String address;
	private int port;
	
	
	 public Client(String ad, int p){
		 address=ad;
		 port=p;
	 }
	 
	 public void run() {
		 Socket s=null;
		 try {
			//Send the message to the server
			s= new Socket(address, port);
			DataOutputStream dos= new DataOutputStream(s.getOutputStream());
			dos.writeUTF("Sending message");
			
		} catch (UnknownHostException e) {
			System.err.println("EOF:"+e.getMessage());
		} catch (IOException e) {
			System.err.println("readline:"+e.getMessage());
		} finally{
			try {
				s.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	 }
}
