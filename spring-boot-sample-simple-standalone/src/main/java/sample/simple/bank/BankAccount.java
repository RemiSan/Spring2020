package sample.simple.bank;

public class BankAccount {

	private String numCB;
	private float money;

	public BankAccount(String numCB, float money) {
		super();
		this.numCB = numCB;
		this.money = money;
	}

	public void crediter(float amount) {
		money += amount;
	}

	public void debiter(float amount) {
		money -= amount;
	}

	public String getNumCB() {
		return numCB;
	}

	public void setNumCB(String numCB) {
		this.numCB = numCB;
	}

	public float getMoney() {
		return money;
	}

	public void setMoney(float money) {
		this.money = money;
	}
}
