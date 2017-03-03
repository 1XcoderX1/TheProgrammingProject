import java.util.Scanner;

public class Input {

	public static void main(String[] args) {

		boolean m_run = true;
		Scanner s = null;
		String userName = args[0];
		System.out.println("Hello " + userName);

		while (m_run) {

			s = new Scanner(System.in);
			String one = s.nextLine();
			System.out.println(one);
		}

		

		

	}

}
