package threads;

import java.util.Random;

public class RunnerRun extends Thread implements Runner {

	private String name;
	private boolean won = false;
	int status;

	public RunnerRun(String name) {

		this.name = name;

	}

	@Override
	public void run() {

		System.out.println(name + " started running");

		try {

			while (!won) {

				Random r = new Random();
				status = r.nextInt(70);

				if (status <= 45 && status > 5) {

					System.out.println(name + " is still running @" + status);

					sleep(100);

				}

				else if (status > 45 && status < 60) {

					System.out.println(name + " is gaining speed and running @" + status);

					sleep(100);
				}

				else if (status < 5) {

					System.out.println(name + " has lost his stamina and he quits.");
					won = true;

				}

				else if (status > 65) {

					System.out.println(name + " has won the match by running @" + status);
					won = true;

				}

			}
		}

		catch (InterruptedException e) {

		}

	}

	@Override
	public void fall() {
		// TODO Auto-generated method stub

	}

}
