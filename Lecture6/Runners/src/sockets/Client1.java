package sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client1 {

	Socket mySocket;
	DataOutputStream toServer;
	DataInputStream fromServer;
	String host;

	public Client1(String host) {

		this.host = host;
		
		try {
			
			
			mySocket = new Socket(host, 4444);
			
		
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
