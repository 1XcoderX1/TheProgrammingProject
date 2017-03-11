package eatingProblem;

public class Fuga extends Thread {

	private Cutlery cutlery;

	public Fuga(Cutlery cutlery) {

		this.cutlery = cutlery;

	}

	public void run() {

		for (int i = 0; true; i++) {

			synchronized (cutlery.getKnife()) {
				System.out.println("Fuga got the knife");

				synchronized (cutlery.getfork()) {
					System.out.println("Fuga got the fork");
					System.out.println("Fuga has eaten" + i + "times");

				}
				System.out.println("Fuga dropped the knife");
			}

			System.out.println("Fuga dropped the fork");

		}

	}

}
