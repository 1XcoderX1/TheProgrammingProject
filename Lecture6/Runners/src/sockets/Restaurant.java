package sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Restaurant {
	public static void main(String[] args) {

		ServerSocket restaurant = null;
		DataInputStream fromClient;
		DataOutputStream toClient;

		try {
			restaurant = new ServerSocket(4444);
		} catch (IOException e) {

			e.printStackTrace();
		}

		try {
			Socket clientSocket = restaurant.accept();

			fromClient = new DataInputStream(clientSocket.getInputStream());
			toClient = new DataOutputStream(clientSocket.getOutputStream());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
