package threads;

public class Starter {

	private Whistle whistle;
	private static final int WIN = 0;

	public static void main(String[] args) {

		RunnerRun bolt = new RunnerRun("bolt");
		RunnerRun blake = new RunnerRun("blake");
		RunnerRun andrei = new RunnerRun("andrei");
		RunnerRun fuga = new RunnerRun("fuga");

		bolt.start();
		blake.start();
		andrei.start();
		fuga.start();

		try {

			Thread.sleep(1000);
			Thread.interrupted();

		} catch (InterruptedException e) {

			System.out.println("Ender waved the flag");

		}

		finally {

			bolt.interrupt();
			blake.interrupt();
			andrei.interrupt();
			fuga.interrupt();

			int b = bolt.status;
			int blakeS = blake.status;
			int a = andrei.status;
			int f = fuga.status;

			if (b > 65) {

				System.out.println("bolt won the race");

			}

			if (blakeS > 65) {

				System.out.println("blake won the race");

			}
			if (a > 65) {

				System.out.println("andrei won the race");

			}
			if (f > 65) {

				System.out.println("fuga won the race");

			}
		}

	}

}
