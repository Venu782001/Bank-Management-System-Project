package com.BankManagementEntity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class TransactionDetails 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long transactionisd;
	private double transactionamount;
	private double balanceamount;
	private Date transactiontime;
	
}
