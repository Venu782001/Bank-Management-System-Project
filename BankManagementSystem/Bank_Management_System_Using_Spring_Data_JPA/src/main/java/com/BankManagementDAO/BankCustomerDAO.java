package com.BankManagementDAO;

import java.util.List;

import com.BankManagementEntity.BankCustomer;

public interface BankCustomerDAO 
{
	void saveBankCustomerDetails(BankCustomer bankCustomer);
	List<BankCustomer> getAllCustomerDetails();
}
