package Army;

public class Battlefield {

	public static void main(String[] args) {

		Ammo ammo = new Ammo();

		Thread[] soldiers = new Thread[args.length];

		for (int i = 0; i < args.length; i++) {

			System.out.println("Soldier " + args[i] + " is being dropped");

			soldiers[i] = new Thread(new Soldier(args[i], ammo));
			soldiers[i].start();

		}

		try {

			for (Thread s : soldiers) {

				s.join();

			}
		}

		catch (InterruptedException e) {

			System.out.println("Soldier was interrupted");

		}

		System.out.println("Ammo should be 0 and actually is " + ammo.getAmmo());

		System.out.println("Battle ended");

	}

}
