package dining;

public class Philosopher extends Thread {

	private Object Fork1;
	private Object Fork2;
	private String name;

	public Philosopher(String name, Object Fork1, Object Fork2) {

		this.name = name;
		this.Fork1 = Fork1;
		this.Fork2 = Fork2;

	}

	public void tell(String comm) {

		System.out.println(comm);

	}

	public void run() {

		for (int i = 0; true; i++) {

			tell(name + " will try to grab the first fork");

			synchronized (Fork1) {

				tell(name + " was able tp gran the first fork");

				tell(name + " will try to grab the second fork");
				synchronized (Fork2) {

					tell(name + " was able to grab the second fork");

					tell(name + " is eating for the " + i + "ith time");

					try {
						sleep(100);
					} catch (InterruptedException e) {

						// Eating takes time
					}
				}

				tell(name + " has dropped the second fork");

			}

			tell(name + " has dropped the first fork");
		}
	}

}
