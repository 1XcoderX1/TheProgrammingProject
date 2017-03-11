package Army;

public class Ammo {

	private int bullets = 0;

	public synchronized void takeBullets() {

		--bullets;

	}

	public synchronized void giveBullets() {

		++bullets;

	}

	public synchronized int getAmmo() {

		return bullets;
	}

}
