package com.BankManagementRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.BankManagementEntity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>
{

}
