package org.sid.bank.repositories;

import org.sid.bank.entities.BankAccount;
import org.sid.bank.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
