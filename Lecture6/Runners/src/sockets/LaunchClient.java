package sockets;

import java.io.IOException;

public class LaunchClient {

	public static void main(String[] args) throws IOException {

		Client c = new Client(args[0]);

		c.run();

	}

}
