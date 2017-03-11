package Army;

public class Soldier implements Runnable {

	private String name;
	private Ammo ammo;

	public Soldier(String name, Ammo ammo) {

		this.name = name;
		this.ammo = ammo;
	}

	public void run() {

		System.out.println("Soldier " + name + " started firing");

		for (int i = 0; i < 100000; i++) {

			ammo.takeBullets();

			ammo.giveBullets();

		}

		System.out.println("Soldier " + name + " died");
	}

}
