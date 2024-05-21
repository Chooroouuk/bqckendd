package ma.chaimae.projetangular.repositories;

import ma.chaimae.projetangular.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
