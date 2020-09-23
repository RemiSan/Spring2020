package sample.simple.bank;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface BankAccountDao extends JpaRepository<BankAccount, Long> {
	
  public BankAccount findByNumCB(String numCB);

}