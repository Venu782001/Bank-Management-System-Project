package com.BankManagementRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.BankManagementEntity.BankCustomer;

public interface BankCustomerRepository extends JpaRepository<BankCustomer, Integer>
{
	
}
