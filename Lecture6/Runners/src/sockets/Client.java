package sockets;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {

	Socket restaurant;
	DataOutputStream toRes;
	DataInputStream fromRes;
	BufferedReader fromUser;
	String host;

	public Client(String host) {

		this.host = host;
		try {
			restaurant = new Socket(host, 4444);

			toRes = new DataOutputStream(restaurant.getOutputStream());

			fromRes = new DataInputStream(restaurant.getInputStream());

			fromUser = new BufferedReader(new InputStreamReader(System.in));

		}

		catch (IOException e) {

		}

	}

	public void run() throws IOException {
		try {

			String order = " ";

			while ((order = fromUser.readLine()) != null) {

				if (order.equals("0"))
					break;

				order = fromUser.readLine();
				String trimmed = order.trim();
				Integer ord = Integer.parseInt(trimmed);

				toRes.writeInt(ord);

			}

			toRes.close();
			fromRes.close();
			restaurant.close();

		} catch (IOException e) {

		}

	}

}
