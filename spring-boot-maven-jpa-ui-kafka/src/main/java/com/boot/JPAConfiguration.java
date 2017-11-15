package com.boot;

import java.util.Properties;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = "com.repository")
@EnableTransactionManagement
public class JPAConfiguration {

	@Autowired
	private Environment environment;

	/*
	 * Populate SpringBoot DataSourceProperties object directly from application.yml
	 * based on prefix.Thanks to .yml, Hierachical data is mapped out of the box
	 * with matching-name properties of DataSourceProperties object].
	 */

	@Bean
	public DataSource dataSource() {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl(environment.getRequiredProperty("spring.datasource.url"));
		dataSource.setUsername(environment.getRequiredProperty("spring.datasource.username"));
		dataSource.setPassword(environment.getRequiredProperty("spring.datasource.password"));
		return dataSource;
	}

	/*
	 * Entity Manager Factory setup.
	 */
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws NamingException {
		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
		factoryBean.setDataSource(dataSource());
		factoryBean.setPackagesToScan(new String[] { "com.model" });
		factoryBean.setJpaVendorAdapter(jpaVendorAdapter());
		factoryBean.setJpaProperties(jpaProperties());
		return factoryBean;
	}

	/*
	 * Provider specific adapter.
	 */
	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
		HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
		return hibernateJpaVendorAdapter;
	}

	/*
	 * Here you can specify any provider specific properties.
	 */
	private Properties jpaProperties() {
		Properties properties = new Properties();
		// properties.put("spring.datasource.url",
		// "jdbc:mysql://localhost:3306/spring_boot");
		// properties.put("spring.datasource.username", "root");
		// properties.put("spring.datasource.password", "root");
		// properties.put("hibernate.dialect",
		// environment.getRequiredProperty("datasource.sampleapp.hibernate.dialect"));
		// properties.put("hibernate.hbm2ddl.auto",
		// environment.getRequiredProperty("spring.jpa.hibernate.ddl-auto"));
		// properties.put("hibernate.show_sql",
		// environment.getRequiredProperty("datasource.sampleapp.hibernate.show_sql"));
		// properties.put("hibernate.format_sql",
		// environment.getRequiredProperty("datasource.sampleapp.hibernate.format_sql"));
		properties.put("hibernate.hbm2ddl.auto", "create");

		return properties;
	}

}
