package com.BankManagementDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.BankManagementEntity.Address;
import com.BankManagementRepository.AddressRepository;

@Component
public class AddressDAOImpl implements AddressDAO
{
	@Autowired
	AddressRepository addressRepository;
	@Override
	public void insertAddressDetails() 
	{
		System.out.println(addressRepository.getClass());
		Address address = new Address();
		address.setCity("Hyderabad");
		address.setState("Telangana");
		address.setStreet("JNTU");
		address.setPincode(500085);
		Address address2 = addressRepository.save(address);
		System.out.println(address2);
	}
	
}
