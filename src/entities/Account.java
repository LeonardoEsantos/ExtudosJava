package entities;

public class Account {

	private int number;
	private String name;
	private double value;

	public Account(int number, String name, double value) {
		this.number = number;
		this.name = name;
		this.value = value;

	}

	public int getNumber() {
		return number;
	}
	/*
	 * N�o ser� usado, numero de conta n�o muda public void setNumber(int number) {
	 * this.number = number; }
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String toString() {
		return "Account " + number + ", Holder: " + name + ", Balance: $" + String.format("%.2f", value);
	}

	public double Deposit(double deposit) {
		return this.value += deposit;
	}

	public double Withdraw(double withdraw) {
		return this.value = (this.value - withdraw)-5;
	}

}
