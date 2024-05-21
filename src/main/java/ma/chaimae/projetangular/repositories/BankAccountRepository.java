package ma.chaimae.projetangular.repositories;

import ma.chaimae.projetangular.entities.BankAccount;
import ma.chaimae.projetangular.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String > {

}
