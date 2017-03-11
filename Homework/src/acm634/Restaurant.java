package acm634;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Restaurant {

	public static void main(String[] args) throws IOException {

		ServerSocket restaurant;
		restaurant = new ServerSocket(4444);

		Socket customerSocket = restaurant.accept();

		DataInputStream fromCustomer;
		DataOutputStream toCustomer;

		fromCustomer = new DataInputStream(customerSocket.getInputStream());
		toCustomer = new DataOutputStream(customerSocket.getOutputStream());

		int order;

		while ((order = fromCustomer.readInt()) != 0) {

			System.out.println(order + "order received from customer");

			toCustomer.writeInt(order);

			System.out.println(order + "sent to customer");

		}		
	}
}
