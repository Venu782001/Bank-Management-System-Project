package com.BankManagement.Config;

import java.util.Scanner;
import javax.persistence.EntityManagerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
@ComponentScan(basePackages="com.BankManagement")
@EnableJpaRepositories("com.BankManagementRepository")
public class BankConfig 
{
	@Bean(name="entityManagerFactory")
	public LocalEntityManagerFactoryBean beanOfLocalEntityManagerFactoryBean()
	{
		LocalEntityManagerFactoryBean localEntityManagerFactoryBean = new LocalEntityManagerFactoryBean();
		localEntityManagerFactoryBean.setPersistenceUnitName("Bank_Management_System_Using_Spring_Data_JPA");
		return localEntityManagerFactoryBean;
		
	}
	@Bean(name="transactionManager")
	public JpaTransactionManager beanOfJpaTransactionManager(EntityManagerFactory emf)
	{
		JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
		jpaTransactionManager.setEntityManagerFactory(emf);
		return jpaTransactionManager;
	}
	@Bean
	public Scanner scannerBean()
	{
		Scanner scanner = new Scanner(System.in);
		return scanner;
		
	}
}




