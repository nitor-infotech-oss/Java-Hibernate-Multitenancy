package com.demo.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(
	exclude = { 
	        DataSourceAutoConfiguration.class,
	        HibernateJpaAutoConfiguration.class,
	        DataSourceTransactionManagerAutoConfiguration.class
	},
	scanBasePackages = { "com.demo.config.poc", "com.demo.rest" }
)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}