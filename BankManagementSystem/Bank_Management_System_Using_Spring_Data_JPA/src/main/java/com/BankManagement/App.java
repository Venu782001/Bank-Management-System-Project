package com.BankManagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.BankManagementConfig.BankConfig;
import com.BankManagementDAO.AddressDAO;
import com.BankManagementService.BankCustomerService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(BankConfig.class);
        
        BankCustomerService bankCustomerService = context.getBean(BankCustomerService.class);
        bankCustomerService.bankCustomerRegistration();
        
//        AddressDAO addressDAO = context.getBean(AddressDAO.class);
//        addressDAO.insertAddressDetails();
    }
}
