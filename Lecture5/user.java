

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class user {

	Socket receiver;
	String output;
	DataOutputStream toReceiver;
	private String host;

	public user(String host) {

		this.host = host;
	}

	public void run() {

		try {
		
		receiver = new Socket(host, 4444);
	
		
		}
		
		catch(UnknownHostException e) {
			
			System.out.println("Unknown host: " + host);
			
		}
		
		catch(IOException e) {
			
			System.out.println("Couldn't listen on port: 4444");
			
			
		}
		
		}

}
