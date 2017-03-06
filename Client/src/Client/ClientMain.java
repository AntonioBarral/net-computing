package Client;

import java.util.Scanner;

import ClientConnections.Client;

public class ClientMain {

	public static void main(String[] args) {
		// Client part. Creation of a client
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce address and port:");
		String address= sc.next();
		int port= sc.nextInt();
		Client c= new Client(address, port);
		c.start();
		sc.close();
	}

}
