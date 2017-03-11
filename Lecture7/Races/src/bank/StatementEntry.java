package bank;

public class StatementEntry {

	int amount;
	String person;

	public StatementEntry(int amount, String person) {

		this.amount = amount;
		this.person = person;

	}

	public int getAmount() {

		return amount;
	}

	public String getPerson() {

		return person;

	}

}
