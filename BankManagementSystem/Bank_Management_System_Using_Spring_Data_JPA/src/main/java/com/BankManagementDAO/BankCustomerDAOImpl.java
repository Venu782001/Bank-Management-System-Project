package com.BankManagementDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.BankManagementEntity.BankCustomer;
import com.BankManagementRepository.BankCustomerRepository;

@Component
public class BankCustomerDAOImpl implements BankCustomerDAO
{
	@Autowired
	BankCustomerRepository bankCustomerRepository;
	@Override
	public void saveBankCustomerDetails(BankCustomer bankCustomer) 
	{
		BankCustomer customer = bankCustomerRepository.save(bankCustomer);
		if(customer!=null)
		{
			System.out.println("Data Inserted...");
		}
		else
		{
			System.out.println("Invalid Data...");
		}
	}
	@Override
	public List<BankCustomer> getAllCustomerDetails() 
	{
		List<BankCustomer> list = bankCustomerRepository.findAll();
		return list;
		
	}

}
