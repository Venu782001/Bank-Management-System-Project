package com.BankManagementService;

import java.util.List;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.BankManagementDAO.BankCustomerDAO;
import com.BankManagementEntity.BankCustomer;

@Component
public class BankCustomerServiceImpl implements BankCustomerService
{
	@Autowired
	private Scanner scanner;
	@Autowired
	private BankCustomerDAO bankCustomerDAO;
	@Override
	public void bankCustomerRegistration() 
	{
		List<BankCustomer> allCustomerDetails = bankCustomerDAO.getAllCustomerDetails();
		BankCustomer bankCustomer = new BankCustomer();
		System.out.println("Enter Name of the Customer:");
		bankCustomer.setName(scanner.next());
		System.out.println("Enter Customer Emailid:");
		String emailid = scanner.next();
		int count=0;
		for (BankCustomer bankCustomer2 : allCustomerDetails) 
		{
			if(bankCustomer2.getEmailid().equals(emailid))
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println("Already Emailid Exist");
		}
		else
		{
			bankCustomer.setEmailid(emailid);
		}
		bankCustomer.setEmailid(scanner.next());
		System.out.println("Enter Customer MobileNumber:");
		bankCustomer.setMobilenumber(scanner.nextLong());
		System.out.println("Enter Customer AadharNumber:");
		bankCustomer.setAadharnumber(scanner.nextLong());
		System.out.println("Enter Customer Gender:");
		bankCustomer.setGender(scanner.next());
		System.out.println("Enter Customer PAN Number(ABCDE1234F)");
		bankCustomer.setPannumber(scanner.next());
		
		bankCustomerDAO.saveBankCustomerDetails(bankCustomer);
	}

}
