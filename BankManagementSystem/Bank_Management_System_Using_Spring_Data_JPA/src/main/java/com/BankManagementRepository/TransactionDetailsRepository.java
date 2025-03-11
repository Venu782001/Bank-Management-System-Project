package com.BankManagementRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.BankManagementEntity.TransactionDetails;

public interface TransactionDetailsRepository extends JpaRepository<TransactionDetails, Long>
{
	
	
}
