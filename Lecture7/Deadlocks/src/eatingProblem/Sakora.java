package eatingProblem;

public class Sakora extends Thread {

	private Cutlery cutlery;

	public Sakora(Cutlery cutlery) {

		this.cutlery = cutlery;

	}

	public void run() {


		for (int i = 0; true; i++) {

			synchronized (cutlery.getfork()) {
				System.out.println("Sakora got the fork");

				synchronized (cutlery.getKnife()) {
					System.out.println("Sakora got the knife");
					System.out.println("Sakora has eaten" + i + "times");

				}
				System.out.println("Sakora dropped the knife");
			}

			System.out.println("Sakora dropped the fork");

		}

	}

}
