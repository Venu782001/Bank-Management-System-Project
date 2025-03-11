package com.BankManagementEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerBankDetails 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int accountnumber;
	private int pinnumber;
	private String ifsccode;
	private String accounttype;
	private String branch;
}
