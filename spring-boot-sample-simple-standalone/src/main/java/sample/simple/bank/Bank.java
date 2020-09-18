package sample.simple.bank;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Bank implements IBank{

	static List<BankAccount> cbs = new ArrayList<BankAccount>();
	static {
		cbs.add(new BankAccount("compte1", 50));
		cbs.add(new BankAccount("compte2", 100));
		cbs.add(new BankAccount("compteStore", 200));
	}

	@Override
	public void transfert(String numCBDebite, String numCBCredite, float amount) {
		findAccount(numCBCredite).debiter(amount);
		findAccount(numCBDebite).crediter(amount);
	}

	private BankAccount findAccount(String id) {
		for(BankAccount ba : cbs) {
			if (ba.getNumCB().equals(id))
				return ba;
		}
		return null;
	}
}
