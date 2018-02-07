package com.htc.spring4.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.htc.spring4.dao.AccountDAO;
import com.htc.spring4.dao.AccountDAOJPAImpl;
import com.htc.spring4.service.AccountJPAService;

@Configuration
@EnableAspectJAutoProxy  // aop 
@EnableTransactionManagement  //Transction..
public class JPAConfig {
	
	@Bean(name="dataSource")
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://localhost:5432/postgres");
		dataSource.setUsername("postgres");
		dataSource.setPassword("123Welcome");
		return dataSource;
	}
	
	@Bean(name="hibernateJpaVendorAdapter")
	public HibernateJpaVendorAdapter getHibernateJpavendorAdapter() {
		return new HibernateJpaVendorAdapter();
	}
	
	@Bean(name="emf")
	public LocalContainerEntityManagerFactoryBean getEntityManagerFactory() {
		LocalContainerEntityManagerFactoryBean emf= new LocalContainerEntityManagerFactoryBean();
		emf.setDataSource(getDataSource());
		emf.setJpaVendorAdapter(getHibernateJpavendorAdapter());
		emf.setPackagesToScan("com.htc.spring4.beans");
		Properties props = new Properties();
		props.put("hibernate.dialect","org.hibernate.dialect.PostgreSQL9Dialect");
		emf.setJpaProperties(props);
		return emf;
	}
	
	@Bean(name="transactionManager")
	public JpaTransactionManager getTransactionManager() {
		JpaTransactionManager tr = new JpaTransactionManager();
		tr.setEntityManagerFactory(getEntityManagerFactory().getObject());
		return tr;
	}
	
	@Bean(name="accountDAO")
	public AccountDAO getAccountDAO() {
		return new AccountDAOJPAImpl();
	}
	
	@Bean(name="accountService")
	public AccountJPAService getAccountJPAService() {
		AccountJPAService service = new AccountJPAService(getAccountDAO());
		return service;
	}
	
}
