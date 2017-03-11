package bank;

import java.util.ArrayList;

public class Account {

	private int balance = 0;
	private ArrayList<StatementEntry> statements = new ArrayList<>();

	public void payIn(int amount, String person) {

		balance += amount;
		statements.add(new StatementEntry(amount, person));

	}

	public int getBalance() {

		return balance;

	}

	public ArrayList<StatementEntry> getStatements() {

		return statements;

	}

}
