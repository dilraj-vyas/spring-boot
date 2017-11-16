package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.model.Device;

//@Import(JPAConfiguration.class)
@SpringBootApplication
//@EnableJpaRepositories(basePackages = { "com.repository" })
//@EntityScan(basePackageClasses = Device.class)
public class SpringDemoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApiApplication.class, args);
	}
}
