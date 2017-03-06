package ServerConnections;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server extends Thread{
	
	
	
	public Server(){}
	
	public void run(){
		ServerSocket ss=null;
		
		try {
			ss= new ServerSocket(7896,0,InetAddress.getByName("localhost"));
			while(true){
				Socket clientSocket= ss.accept();
				InputHandler ih= new InputHandler(clientSocket);
				ih.start();
			}
			
		} catch (UnknownHostException e) {
			System.err.println("EOF:"+e.getMessage());
		} catch (IOException e) {
			System.out.println("readline:"+e.getMessage());
		} finally{
			try {
				ss.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
