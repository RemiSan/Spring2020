package sample.simple.bank;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;


// Imports ...

@Transactional
public interface BankAccountDao extends JpaRepository<BankAccount, Long> {

  /**
   * This method will find an User instance in the database by its email.
   * Note that this method is not implemented and its working code will be
   * automagically generated from its signature by Spring Data JPA.
   */
  public BankAccount findByEmail(String email);

}