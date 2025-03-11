package com.BankManagementRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.BankManagementEntity.CustomerBankDetails;

public interface CustomerBankDetailsRepository extends JpaRepository<CustomerBankDetails, Integer>
{

}
