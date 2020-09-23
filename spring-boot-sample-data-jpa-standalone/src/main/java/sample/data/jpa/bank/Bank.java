package sample.simple.bank;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bank implements IBank{

	@Autowired
	private BankAccountDao bankAccountDao;
	
	@Override
	public void transfert(String numCBDebite, String numCBCredite, float amount) {
		findAccount(numCBCredite).debiter(amount);
		findAccount(numCBDebite).crediter(amount);
	}

	private BankAccount findAccount(String id) {
		return bankAccountDao.findByNumCB(id);
	}
}
