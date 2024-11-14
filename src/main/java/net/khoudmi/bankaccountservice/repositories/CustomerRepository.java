package net.khoudmi.bankaccountservice.repositories;

import net.khoudmi.bankaccountservice.entities.BankAccount;
import net.khoudmi.bankaccountservice.entities.Customer;
import net.khoudmi.bankaccountservice.enums.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
