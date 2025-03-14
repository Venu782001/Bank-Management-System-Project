package com.BankManagementEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankCustomer 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(unique=true, nullable=false)
	private String name;
	@Column(unique=true, nullable=false)
	private String emailid;
	@Column(unique=true, nullable=false)
	private long mobilenumber;
	@Column(unique=true, nullable=false)
	private long aadharnumber;
	private String gender;
	@Column(unique=true, nullable=false)
	private String pannumber;
}
