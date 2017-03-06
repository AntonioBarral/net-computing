package Server;

import ServerConnections.Server;

public class ServerMain {
	public static void main(String[] args) {
		// Server part. Creation of a server
		Server s= new Server();
		s.start();
		
	}
}
