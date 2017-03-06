package ServerConnections;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class InputHandler extends Thread {

	private Socket clientSocket;
	
	public InputHandler(Socket cs){
		clientSocket=cs;
	}
	
	public void run() {
		try {
			DataInputStream dis= new DataInputStream(clientSocket.getInputStream());
			String method= dis.readUTF();
			
			switch(method) {
			
			case "Sending message":
				System.out.println("Message received");
				break;
			
			case "Method 1":
				//ejecuta metodo 1
				break;
			case "Method 2":
				//ejecuta metodo 2
				break;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
