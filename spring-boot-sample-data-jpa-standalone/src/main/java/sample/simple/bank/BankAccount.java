package sample.simple.bank;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "bankaccount")
public class BankAccount implements Serializable{

	private static final long serialVersionUID = 6364599096915453660L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String numCB;
	
	@NotNull
	private float money;

	public BankAccount() {}
	
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
