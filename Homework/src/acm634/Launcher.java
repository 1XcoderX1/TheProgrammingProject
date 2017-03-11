package acm634;

import java.io.IOException;

public class Launcher {

	public static void main(String[] args) throws IOException, ArrayIndexOutOfBoundsException {

		Customer a = new Customer(args[0]);

		a.run();

	}

}
