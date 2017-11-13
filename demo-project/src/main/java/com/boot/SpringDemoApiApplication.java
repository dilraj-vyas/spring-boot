package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.controller"})
public class SpringDemoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApiApplication.class, args);
	}
}
