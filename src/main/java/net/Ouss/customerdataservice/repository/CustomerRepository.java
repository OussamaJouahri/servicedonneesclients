package net.Ouss.customerdataservice.repository;

import net.Ouss.customerdataservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository <Customer, Long> {

}
